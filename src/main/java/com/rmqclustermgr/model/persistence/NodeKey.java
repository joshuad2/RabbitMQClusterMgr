/**
 * 
 */
package com.rmqclustermgr.model.persistence;

/**
 * @author jdavis
 *
 */
public class NodeKey implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7395143093597713102L;

	private String nodeName;
    private ClusterKey cluster;
    private VhostKey vhost;
    
	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public ClusterKey getCluster() {
		return cluster;
	}

	public void setCluster(ClusterKey cluster) {
		this.cluster = cluster;
	}

	public VhostKey getVhost() {
		return vhost;
	}

	public void setVhost(VhostKey vhost) {
		this.vhost = vhost;
	}
	
}
