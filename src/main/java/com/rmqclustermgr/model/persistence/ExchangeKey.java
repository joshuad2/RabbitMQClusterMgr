package com.rmqclustermgr.model.persistence;

import java.io.Serializable;

public class ExchangeKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6279907548380684810L;

	private String exchangeName;
	
	private NodeKey node;
	
	private VhostKey virtualHost;

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public NodeKey getNode() {
		return node;
	}

	public void setNode(NodeKey node) {
		this.node = node;
	}

	public VhostKey getVirtualHost() {
		return virtualHost;
	}

	public void setVirtualHost(VhostKey virtualHost) {
		this.virtualHost = virtualHost;
	}
}
