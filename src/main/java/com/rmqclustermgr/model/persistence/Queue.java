package com.rmqclustermgr.model.persistence;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;
@Region("queue")
public class Queue implements ModelGenericIfc<QueueKey> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3538646703065467382L;

	@Id
	private QueueKey key;
	private Boolean isDurable;
	private Boolean isPersisted;
	private Boolean isMirrored;	
	private UserKey owner;
	private List <QueueBinding> queueBindings;
	/**
	 * Constructor
	 * @param queueName
	 * @param vhost
	 * @param cluster
	 * @param node
	 */
	public Queue(String queueName, VhostKey vhost, ClusterKey cluster, NodeKey node){
		QueueKey queueKey=new QueueKey();
		queueKey.setCluster(cluster);
		queueKey.setNode(node);
		queueKey.setQueueName(queueName);
		queueKey.setVhost(vhost);
		this.key=queueKey;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return this.getKey().getQueueName();
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.getKey().setQueueName(name);
	}
	/**
	 * @return the isDurable
	 */
	public Boolean getIsDurable() {
		return isDurable;
	}
	/**
	 * @param isDurable the isDurable to set
	 */
	public void setIsDurable(Boolean isDurable) {
		this.isDurable = isDurable;
	}
	/**
	 * @return the isPersisted
	 */
	public Boolean getIsPersisted() {
		return isPersisted;
	}
	/**
	 * @param isPersisted the isPersisted to set
	 */
	public void setIsPersisted(Boolean isPersisted) {
		this.isPersisted = isPersisted;
	}
	/**
	 * @return the isMirrored
	 */
	public Boolean getIsMirrored() {
		return isMirrored;
	}
	/**
	 * @param isMirrored the isMirrored to set
	 */
	public void setIsMirrored(Boolean isMirrored) {
		this.isMirrored = isMirrored;
	}
	@Override
	public QueueKey getKey() {
        return this.key;
	}
	public UserKey getOwner() {
		return owner;
	}
	public void setOwner(UserKey owner) {
		this.owner = owner;
	}
	public void setKey(QueueKey key) {
		this.key = key;
	}
	public List<QueueBinding> getQueueBindings() {
		return queueBindings;
	}
	public void setQueueBindings(List<QueueBinding> queueBindings) {
		this.queueBindings = queueBindings;
	}
}
