package com.rmqclustermgr.model.persistence;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;

@Region("rabbitmqPolicy")
public class Policy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6083185594565625891L;

	@Id
	private PolicyKey key;
	private int priority;
	private String selection;
	private String federationUpsteamSet;
	private String haMode;
	private String applyTo;//can be queues exchange or all
	
	public Policy(String policyName, UserKey owner, VhostKey vHost){
		PolicyKey policyKey=new PolicyKey();
		policyKey.setOwner(owner);
		policyKey.setPolicyName(policyName);
		policyKey.setvHost(vHost);
		this.key=policyKey;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return this.getKey().getPolicyName();
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
	  this.getKey().setPolicyName(name);
	}
	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
	/**
	 * @return the selection
	 */
	public String getSelection() {
		return selection;
	}
	/**
	 * @param selection the selection to set
	 */
	public void setSelection(String selection) {
		this.selection = selection;
	}
	/**
	 * @return the federationUpsteamSet
	 */
	public String getFederationUpsteamSet() {
		return federationUpsteamSet;
	}
	/**
	 * @param federationUpsteamSet the federationUpsteamSet to set
	 */
	public void setFederationUpsteamSet(String federationUpsteamSet) {
		this.federationUpsteamSet = federationUpsteamSet;
	}
	/**
	 * @return the haMode
	 */
	public String getHaMode() {
		return haMode;
	}
	/**
	 * @param haMode the haMode to set
	 */
	public void setHaMode(String haMode) {
		this.haMode = haMode;
	}
	/**
	 * @return the applyTo
	 */
	public String getApplyTo() {
		return applyTo;
	}
	/**
	 * @param applyTo the applyTo to set
	 */
	public void setApplyTo(String applyTo) {
		this.applyTo = applyTo;
	}
	public PolicyKey getKey() {
		return key;
	}
	public void setKey(PolicyKey key) {
		this.key = key;
	}

}
