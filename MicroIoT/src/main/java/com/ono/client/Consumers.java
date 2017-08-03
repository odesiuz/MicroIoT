package com.ono.client;

import java.util.Enumeration;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Assert;

import com.ono.mqtt.transporters.MessageConsumers;

public class Consumers implements MessageConsumers{

	private ConnectionFactory connectionFactory;
	private Connection connection;
	private Session session;
	private Topic jmsReplyTo, testTopic;
	private MessageConsumer consumer;
	private MessageProducer producer;
	private Message message;
	private MapMessage reply;
	
	@Override
	public MapMessage getMessageConsumers() throws Exception {
		connectionFactory = new ActiveMQConnectionFactory("tcp://10.42.72.62:61618");
		connection = connectionFactory.createConnection();
		//connection.setClientID("All_Consumers");
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		jmsReplyTo = session.createTemporaryTopic();
		String topicName = "ActiveMQ.Statistics.Subscription";
		testTopic = session.createTopic(topicName);
		
		consumer = session.createConsumer(jmsReplyTo);
		producer = session.createProducer(testTopic);
		
		message = session.createMessage();
		message.setJMSReplyTo(jmsReplyTo);
		
		connection.start();
		
		new Thread(() -> {
			try {
					producer.send(message);
					reply = (MapMessage) consumer.receive(500);
					Assert.assertNotNull(reply);
					
					for (@SuppressWarnings("rawtypes")
					Enumeration e = reply.getMapNames(); e.hasMoreElements();) {
						String name = e.nextElement().toString();
						//String json = reply.getString("clientId");
						System.out.println("Statistics: " + name + "=" + reply.getObject(name));
						//System.out.println(json);
						
					}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
		
		extracted();

		connection.stop();
		
		return reply;
	}

	@Override
	public MapMessage getMessageConsumer(String topic) throws Exception {
		connectionFactory = new ActiveMQConnectionFactory("tcp://10.42.72.62:61618");
		connection = connectionFactory.createConnection();
		//connection.setClientID("ConsumerByTopic");
		session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		jmsReplyTo = session.createTemporaryTopic();
		testTopic = session.createTopic(topic);
		String topicName = "ActiveMQ.Statistics.Destination." + testTopic.getTopicName();
		Topic messageTopic = session.createTopic(topicName);
		
		consumer = session.createConsumer(jmsReplyTo);
		producer = session.createProducer(null);
		
		message = session.createMessage();
		message.setJMSReplyTo(jmsReplyTo);
		
		connection.start();
		
		new Thread(() -> {
			try {
					producer.send(testTopic, message);
					producer.send(messageTopic, message);
					reply = (MapMessage) consumer.receive(500);
					Assert.assertNotNull(reply);
					Assert.assertTrue(reply.getMapNames().hasMoreElements());
					
					for (@SuppressWarnings("rawtypes")
					Enumeration e = reply.getMapNames(); e.hasMoreElements();) {
						String name = e.nextElement().toString();
						System.out.println("Statistics: " + name + "=" + reply.getObject(name));
					}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
		
		extracted();
		
		connection.stop();
		
		return reply;
		
	}

	private void extracted() throws InterruptedException {
		Thread.currentThread();
		Thread.sleep(1000);
	}
}
