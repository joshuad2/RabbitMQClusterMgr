package com.rmqclustermgr.model.persistence;

import java.io.Serializable;

public class VhostKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5467738226756427036L;
	
	private String vHostName;
	
	private ClusterKey cluster;
	
	private NodeKey node;

	public String getvHostName() {
		return vHostName;
	}

	public void setvHostName(String vHostName) {
		this.vHostName = vHostName;
	}

	public ClusterKey getCluster() {
		return cluster;
	}

	public void setCluster(ClusterKey cluster) {
		this.cluster = cluster;
	}

	public NodeKey getNode() {
		return node;
	}

	public void setNode(NodeKey node) {
		this.node = node;
	}

}
