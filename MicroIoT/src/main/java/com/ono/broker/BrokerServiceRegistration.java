package com.ono.broker;

import com.ono.client.Consumers;
import com.ono.databaseUtil.ConsumerClientDBController;

public class BrokerServiceRegistration {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("activemq.base", "user.dir");
		
		MyBrokerService myBrokerService = new MyBrokerService();
		myBrokerService.runBroker();
		
		System.out.println("Broker URI: " + myBrokerService.getBrokerConnectionUri());
		/*Consumers consumers = new Consumers();
		consumers.getMessageConsumers();*/
		
		ConsumerClientDBController consumerDB = new ConsumerClientDBController();
		consumerDB.saveConsumersStat();
		
	}

}
