package com.ono.mqtt.transporters;

public interface MessageProducers {
	
	public void getMessageProducers();
	
	public void getMessageProducer(String topic);
	
	/**
	 * Set the channel which the message producer should use to publish any message.
	 * 
	 * @param channel Sender channel which will be set by the MqttBrokerConnection
	 */
	public void setSenderChannel(MessageSenderChannel channel);

}
