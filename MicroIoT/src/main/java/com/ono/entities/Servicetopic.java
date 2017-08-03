package com.ono.entities;
// Generated 19-Jun-2017 16:59:40 by Hibernate Tools 5.2.3.Final

/**
 * Servicetopic generated by hbm2java
 */
public class Servicetopic implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String serviceTopic;
	private String dequeueCount;
	private String averageMessageSize;
	private String brokerId;
	private String memoryUsage;
	private String consumerCount;
	private String minEnqueueTime;
	private String memoryPercentageUsage;
	private String averageEnqueueTime;
	private String messageCached;
	private String expiredCount;
	private String inflightCount;
	private String maxEnqueueTime;
	private String dispatchCount;
	private String size;
	private String producerCount;
	private String memoryLimit;
	private String brokerName;
	private String enqueueCount;

	public Servicetopic() {
	}

	public Servicetopic(String serviceTopic, String brokerId) {
		this.serviceTopic = serviceTopic;
		this.brokerId = brokerId;
	}

	public Servicetopic(String serviceTopic, String dequeueCount, String averageMessageSize, String brokerId,
			String memoryUsage, String consumerCount, String minEnqueueTime, String memoryPercentageUsage,
			String averageEnqueueTime, String messageCached, String expiredCount, String inflightCount,
			String maxEnqueueTime, String dispatchCount, String size, String producerCount, String memoryLimit,
			String brokerName, String enqueueCount) {
		this.serviceTopic = serviceTopic;
		this.dequeueCount = dequeueCount;
		this.averageMessageSize = averageMessageSize;
		this.brokerId = brokerId;
		this.memoryUsage = memoryUsage;
		this.consumerCount = consumerCount;
		this.minEnqueueTime = minEnqueueTime;
		this.memoryPercentageUsage = memoryPercentageUsage;
		this.averageEnqueueTime = averageEnqueueTime;
		this.messageCached = messageCached;
		this.expiredCount = expiredCount;
		this.inflightCount = inflightCount;
		this.maxEnqueueTime = maxEnqueueTime;
		this.dispatchCount = dispatchCount;
		this.size = size;
		this.producerCount = producerCount;
		this.memoryLimit = memoryLimit;
		this.brokerName = brokerName;
		this.enqueueCount = enqueueCount;
	}

	public String getServiceTopic() {
		return this.serviceTopic;
	}

	public void setServiceTopic(String serviceTopic) {
		this.serviceTopic = serviceTopic;
	}

	public String getDequeueCount() {
		return this.dequeueCount;
	}

	public void setDequeueCount(String dequeueCount) {
		this.dequeueCount = dequeueCount;
	}

	public String getAverageMessageSize() {
		return this.averageMessageSize;
	}

	public void setAverageMessageSize(String averageMessageSize) {
		this.averageMessageSize = averageMessageSize;
	}

	public String getBrokerId() {
		return this.brokerId;
	}

	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}

	public String getMemoryUsage() {
		return this.memoryUsage;
	}

	public void setMemoryUsage(String memoryUsage) {
		this.memoryUsage = memoryUsage;
	}

	public String getConsumerCount() {
		return this.consumerCount;
	}

	public void setConsumerCount(String consumerCount) {
		this.consumerCount = consumerCount;
	}

	public String getMinEnqueueTime() {
		return this.minEnqueueTime;
	}

	public void setMinEnqueueTime(String minEnqueueTime) {
		this.minEnqueueTime = minEnqueueTime;
	}

	public String getMemoryPercentageUsage() {
		return this.memoryPercentageUsage;
	}

	public void setMemoryPercentageUsage(String memoryPercentageUsage) {
		this.memoryPercentageUsage = memoryPercentageUsage;
	}

	public String getAverageEnqueueTime() {
		return this.averageEnqueueTime;
	}

	public void setAverageEnqueueTime(String averageEnqueueTime) {
		this.averageEnqueueTime = averageEnqueueTime;
	}

	public String getMessageCached() {
		return this.messageCached;
	}

	public void setMessageCached(String messageCached) {
		this.messageCached = messageCached;
	}

	public String getExpiredCount() {
		return this.expiredCount;
	}

	public void setExpiredCount(String expiredCount) {
		this.expiredCount = expiredCount;
	}

	public String getInflightCount() {
		return this.inflightCount;
	}

	public void setInflightCount(String inflightCount) {
		this.inflightCount = inflightCount;
	}

	public String getMaxEnqueueTime() {
		return this.maxEnqueueTime;
	}

	public void setMaxEnqueueTime(String maxEnqueueTime) {
		this.maxEnqueueTime = maxEnqueueTime;
	}

	public String getDispatchCount() {
		return this.dispatchCount;
	}

	public void setDispatchCount(String dispatchCount) {
		this.dispatchCount = dispatchCount;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getProducerCount() {
		return this.producerCount;
	}

	public void setProducerCount(String producerCount) {
		this.producerCount = producerCount;
	}

	public String getMemoryLimit() {
		return this.memoryLimit;
	}

	public void setMemoryLimit(String memoryLimit) {
		this.memoryLimit = memoryLimit;
	}

	public String getBrokerName() {
		return this.brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	public String getEnqueueCount() {
		return this.enqueueCount;
	}

	public void setEnqueueCount(String enqueueCount) {
		this.enqueueCount = enqueueCount;
	}

}
