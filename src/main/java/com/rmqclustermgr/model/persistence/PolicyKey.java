package com.rmqclustermgr.model.persistence;

public class PolicyKey implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2441080283503700527L;
	private UserKey owner;
	private VhostKey vHost;
	private String policyName;
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
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
}
