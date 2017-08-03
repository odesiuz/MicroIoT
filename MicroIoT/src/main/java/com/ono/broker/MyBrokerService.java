package com.ono.broker;

import java.net.URI;

import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class MyBrokerService {

	private BrokerService brokerService;
	private String configUri;
	private URI brokerUri;
	
	public MyBrokerService() throws Exception {
		configUri = "xbean:src/main/resources/config/brokerConfig.xml";
		brokerUri = new URI(configUri);
	} 
	
	public URI getBrokerConnectionUri() throws Exception, Exception {
		return brokerService.getTransportConnectors().
				get(0).getConnectUri();
	}
	
	public URI getBrokerURI() {
		return brokerUri;
	}
	
	public String getMyBrokerName() {
		return brokerService.getBrokerName();
	}
	
	public void runBroker() throws Exception {
		brokerService = BrokerFactory.createBroker(getBrokerURI());
		brokerService.start();
	}
}
