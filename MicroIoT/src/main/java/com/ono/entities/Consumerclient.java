package com.ono.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Generated 19-Jun-2017 16:59:40 by Hibernate Tools 5.2.3.Final

/**
 * Consumerclient POJO class is used to save consumers statistics to a database
 * 
 * @author uviase
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "consumerclient", catalog = "mqfdatabase")
@XmlRootElement(name = "consumerclient")
public class Consumerclient implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String clientId;
	private String brokerId;
	private String slowConsumer;
	private int maximumPendingMessageLimit;
	private String sessionId;
	private long enqueueCounter;
	private long prefetchSize;
	private long dispatchedQueueSize;
	private String serviceTopic;
	private String retroactive;
	private String connectionId;
	private String exclusive;
	private String selector;
	private int dispatchedcounter;
	private String brokerName;

	public Consumerclient() {
	}

	public Consumerclient(String clientId, String brokerId, String serviceTopic) {
		this.clientId = clientId;
		this.brokerId = brokerId;
		this.serviceTopic = serviceTopic;
	}

	public Consumerclient(String clientId, String brokerId, String slowConsumer, int maximumPendingMessageLimit,
			String sessionId, long enqueueCounter, long prefetchSize, long dispatchedQueueSize,
			String serviceTopic, String retroactive, String connectionId, String exclusive, String selector,
			int dispatchedcounter, String brokerName) {
		this.clientId = clientId;
		this.brokerId = brokerId;
		this.slowConsumer = slowConsumer;
		this.maximumPendingMessageLimit = maximumPendingMessageLimit;
		this.sessionId = sessionId;
		this.enqueueCounter = enqueueCounter;
		this.prefetchSize = prefetchSize;
		this.dispatchedQueueSize = dispatchedQueueSize;
		this.serviceTopic = serviceTopic;
		this.retroactive = retroactive;
		this.connectionId = connectionId;
		this.exclusive = exclusive;
		this.selector = selector;
		this.dispatchedcounter = dispatchedcounter;
		this.brokerName = brokerName;
	}

	@Id
	@Column(name = "ClientID", unique = true, nullable = false)
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@Column(name = "BrokerID", nullable = false)
	public String getBrokerId() {
		return this.brokerId;
	}

	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}

	@Column(name = "Slow_Consumer")
	public String getSlowConsumer() {
		return this.slowConsumer;
	}

	public void setSlowConsumer(String slowConsumer) {
		this.slowConsumer = slowConsumer;
	}

	@Column(name = "MaximumPendingMessageLimit")
	public int getMaximumPendingMessageLimit() {
		return this.maximumPendingMessageLimit;
	}

	public void setMaximumPendingMessageLimit(int maximumPendingMessageLimit) {
		this.maximumPendingMessageLimit = maximumPendingMessageLimit;
	}

	@Column(name = "SessionID")
	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "EnqueueCounter")
	public long getEnqueueCounter() {
		return this.enqueueCounter;
	}

	public void setEnqueueCounter(long enqueueCounter) {
		this.enqueueCounter = enqueueCounter;
	}

	@Column(name = "PrefetchSize")
	public long getPrefetchSize() {
		return this.prefetchSize;
	}

	public void setPrefetchSize(long prefetchSize) {
		this.prefetchSize = prefetchSize;
	}

	@Column(name = "DispatchedQueueSize")
	public long getDispatchedQueueSize() {
		return this.dispatchedQueueSize;
	}

	public void setDispatchedQueueSize(long dispatchedQueueSize) {
		this.dispatchedQueueSize = dispatchedQueueSize;
	}

	@Column(name = "ServiceTopic", nullable = false)
	public String getServiceTopic() {
		return this.serviceTopic;
	}

	public void setServiceTopic(String serviceTopic) {
		this.serviceTopic = serviceTopic;
	}

	@Column(name = "Retroactive")
	public String getRetroactive() {
		return this.retroactive;
	}

	public void setRetroactive(String retroactive) {
		this.retroactive = retroactive;
	}

	@Column(name = "ConnectionID")
	public String getConnectionId() {
		return this.connectionId;
	}

	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}

	@Column(name = "Exclusive")
	public String getExclusive() {
		return this.exclusive;
	}

	public void setExclusive(String exclusive) {
		this.exclusive = exclusive;
	}

	@Column(name = "Selector")
	public String getSelector() {
		return this.selector;
	}

	public void setSelector(String selector) {
		this.selector = selector;
	}

	@Column(name = "Dispatchedcounter")
	public int getDispatchedcounter() {
		return this.dispatchedcounter;
	}

	public void setDispatchedcounter(int dispatchedcounter) {
		this.dispatchedcounter = dispatchedcounter;
	}

	@Column(name = "BrokerName")
	public String getBrokerName() {
		return this.brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

}
