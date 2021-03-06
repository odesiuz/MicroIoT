package com.ono.entities;
// Generated 19-Jun-2017 16:59:40 by Hibernate Tools 5.2.3.Final

/**
 * Mqfbroker generated by hbm2java
 */
public class Mqfbroker implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String brokerName;
	private String connectionProtocol;
	private String connectionIpAddress;
	private String connectionPort;

	public Mqfbroker() {
	}

	public Mqfbroker(String id) {
		this.id = id;
	}

	public Mqfbroker(String id, String brokerName, String connectionProtocol, String connectionIpAddress,
			String connectionPort) {
		this.id = id;
		this.brokerName = brokerName;
		this.connectionProtocol = connectionProtocol;
		this.connectionIpAddress = connectionIpAddress;
		this.connectionPort = connectionPort;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrokerName() {
		return this.brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	public String getConnectionProtocol() {
		return this.connectionProtocol;
	}

	public void setConnectionProtocol(String connectionProtocol) {
		this.connectionProtocol = connectionProtocol;
	}

	public String getConnectionIpAddress() {
		return this.connectionIpAddress;
	}

	public void setConnectionIpAddress(String connectionIpAddress) {
		this.connectionIpAddress = connectionIpAddress;
	}

	public String getConnectionPort() {
		return this.connectionPort;
	}

	public void setConnectionPort(String connectionPort) {
		this.connectionPort = connectionPort;
	}

}
