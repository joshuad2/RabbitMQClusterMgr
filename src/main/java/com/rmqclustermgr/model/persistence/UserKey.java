package com.rmqclustermgr.model.persistence;

public class UserKey implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3232773880942691751L;
	private String userName;
	private ClusterKey cluster;
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ClusterKey getCluster() {
		return cluster;
	}

	public void setCluster(ClusterKey cluster) {
		this.cluster = cluster;
	}
	
}
