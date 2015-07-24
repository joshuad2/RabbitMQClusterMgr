package com.rmqclustermgr.model.persistence;

import java.io.Serializable;

public class FederationUpstreamKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2562695300315880197L;
	private String federationUpStreamName;
	private ClusterKey cluster;
	private UserKey owner;
	private VhostKey vHost;
	
	public String getFederationUpStreamName() {
		return federationUpStreamName;
	}
	public void setFederationUpStreamName(String federationUpStreamName) {
		this.federationUpStreamName = federationUpStreamName;
	}
	public ClusterKey getCluster() {
		return cluster;
	}
	public void setCluster(ClusterKey cluster) {
		this.cluster = cluster;
	}
	public UserKey getOwner() {
		return owner;
	}
	public void setOwner(UserKey owner) {
		this.owner = owner;
	}
	public VhostKey getvHost() {
		return vHost;
	}
	public void setvHost(VhostKey vHost) {
		this.vHost = vHost;
	}
}
