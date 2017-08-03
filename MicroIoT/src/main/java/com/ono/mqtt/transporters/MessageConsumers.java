package com.ono.mqtt.transporters;

import javax.jms.MapMessage;

public interface MessageConsumers {

	public MapMessage getMessageConsumers() throws Exception;
	
	public MapMessage getMessageConsumer(String topic) throws Exception;
	
}
