package com.rmqclustermgr.model.persistence;

public class QueueKey implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8884244441109468245L;
	private String queueName;
    private NodeKey node;
	private VhostKey vhost;
	private ClusterKey cluster;
	
	public String getQueueName() {
		return queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	public NodeKey getNode() {
		return node;
	}
	public void setNode(NodeKey node) {
		this.node = node;
	}
	public VhostKey getVhost() {
		return vhost;
	}
	public void setVhost(VhostKey vhost) {
		this.vhost = vhost;
	}
	public ClusterKey getCluster() {
		return cluster;
	}
	public void setCluster(ClusterKey cluster) {
		this.cluster = cluster;
	}
}
