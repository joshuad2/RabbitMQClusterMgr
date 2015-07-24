package com.rmqclustermgr.model.persistence;

public class ClusterKey implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3962263108080669817L;
	private String clusterName;
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	
}
