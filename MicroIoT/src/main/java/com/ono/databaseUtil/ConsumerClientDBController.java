package com.ono.databaseUtil;

import javax.jms.MapMessage;

import org.hibernate.Session;

import com.ono.client.Consumers;
import com.ono.entities.Consumerclient;

public class ConsumerClientDBController {
	
	private Consumers consumer = new Consumers();

	public boolean saveConsumersStat() throws Exception {
		MapMessage message = consumer.getMessageConsumers();
		boolean hasError = false;
		Session session = null;
		try {
			session = DatabaseConnectionUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Consumerclient consumerClient = new Consumerclient(message.getString("clientId"), message.getString("brokerId"), 
					message.getString("slowConsumer"), message.getInt("maximumPendingMessageLimit"), message.getString("sessionId"),
					message.getLong("enqueueCounter"), message.getLong("prefetchSize"), message.getLong("dispatchedQueueSize"),
					message.getString("serviceTopic"), message.getString("retroactive"), message.getString("connectionId"), 
					message.getString("exclusive"), message.getString("selector"), message.getInt("dispatchedcounter"), 
					message.getString("brokerName"));
			session.saveOrUpdate(consumerClient);
			session.getTransaction().commit();
			System.out.println("Consumer Statistics:" + consumerClient.getBrokerName());
		}catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
				System.out.println("Transaction rolled back");
			}
		}finally {
			if (session != null) {
				session.close();
			}
		}
		return hasError;
	}
}
