package com.rmqclustermgr.model.persistence;

import org.springframework.data.annotation.Id;

public class FederationUpstream implements ModelGenericIfc<FederationUpstreamKey>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -986624206114764771L;

	@Id
	private FederationUpstreamKey key;
	private String federationURI;
	private Long federationExpiration;

	public FederationUpstream(String federationUpStreamName,ClusterKey cluster, UserKey owner, VhostKey vHost){
		FederationUpstreamKey fukey=new FederationUpstreamKey();
		fukey.setCluster(cluster);
		fukey.setFederationUpStreamName(federationUpStreamName);
		fukey.setOwner(owner);
		fukey.setvHost(vHost);
		this.key=fukey;
	}
	/**
	 * @return the federationUpStreamName
	 */
	public String getFederationUpStreamName() {
		return key.getFederationUpStreamName();
	}
	/**
	 * @param federationUpStreamName the federationUpStreamName to set
	 */
	public void setFederationUpStreamName(String federationUpStreamName) {
		this.setFederationUpStreamName(federationUpStreamName);
	}
	/**
	 * @return the federationURI
	 */
	public String getFederationURI() {
		return federationURI;
	}
	/**
	 * @param federationURI the federationURI to set
	 */
	public void setFederationURI(String federationURI) {
		this.federationURI = federationURI;
	}
	/**
	 * @return the federationExpiration
	 */
	public Long getFederationExpiration() {
		return federationExpiration;
	}
	/**
	 * @param federationExpiration the federationExpiration to set
	 */
	public void setFederationExpiration(Long federationExpiration) {
		this.federationExpiration = federationExpiration;
	}
	@Override
	public FederationUpstreamKey getKey() {
		return this.getKey();
	}
	public ClusterKey getCluster() {
		return key.getCluster();
	}
	public void setCluster(ClusterKey cluster) {
		key.setCluster(cluster);
	}
	public UserKey getOwner() {
		return key.getOwner();
	}
	public void setOwner(UserKey owner) {
		key.setOwner(owner);
	}
	public VhostKey getvHost() {
		return key.getvHost();
	}
	public void setvHost(VhostKey vHost) {
		key.setvHost(vHost);
	}
}
