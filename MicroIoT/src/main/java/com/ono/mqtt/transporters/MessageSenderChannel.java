package com.ono.mqtt.transporters;

public interface MessageSenderChannel {

	/**
	 * Send a message to the MQTT broker
	 * 
	 * @param topic Topic to publish the message to
	 * @param payload message payload
	 * @throws Exception error handler for failed publish process
	 */
	public void publish(String topic, byte[] payload) throws Exception;
}
