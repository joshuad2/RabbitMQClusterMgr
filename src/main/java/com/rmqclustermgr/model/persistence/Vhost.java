package com.rmqclustermgr.model.persistence;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;

@Region("rabbitmqVhost")
public class Vhost implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6651784173613390046L;
	@Id
	private VhostKey key;
	private List<User> users;
	private List <Queue> queues;
	private List <Exchange> exchanges;


	public Vhost(String vHostName, ClusterKey cluster, NodeKey node){
		VhostKey vhostKey=new VhostKey();
		vhostKey.setCluster(cluster);
		vhostKey.setNode(node);
		vhostKey.setvHostName(vHostName);
		this.key=vhostKey;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return this.getKey().getvHostName();
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.getKey().setvHostName(name);
	}

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

	/**
	 * @return the queues
	 */
	public List<Queue> getQueues() {
		return queues;
	}

	/**
	 * @param queues the queues to set
	 */
	public void setQueues(List<Queue> queues) {
		this.queues = queues;
	}

	/**
	 * @return the exchanges
	 */
	public List<Exchange> getExchanges() {
		return exchanges;
	}

	/**
	 * @param exchanges the exchanges to set
	 */
	public void setExchanges(List<Exchange> exchanges) {
		this.exchanges = exchanges;
	}

	
	public VhostKey getKey() {
		return key;
	}

	public void setKey(VhostKey key) {
		this.key = key;
	}
}
