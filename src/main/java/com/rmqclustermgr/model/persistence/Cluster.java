package com.rmqclustermgr.model.persistence;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;
@Region("rabbitmqCluster")
public class Cluster implements ModelGenericIfc<ClusterKey> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7408951142309246977L;
	
	private ProjectKey project;
	@Id
	private ClusterKey clusterKey;
	private String description;
	private ClusterType clusterType;
	private Long netTickTime;
	private List <FederationUpstream> federationUpstreams;
	private List <Policy> policies;
	private UserKey owner;
	private List <UserKey> users;
	private Vhost vHost;
	private List<Vhost> vhosts;
	private List<NodeKey> nodes;
	
	public Cluster(String clusterName){
		ClusterKey clusterKey=new ClusterKey();
		clusterKey.setClusterName(clusterName);
		this.clusterKey=clusterKey;
	}
	
	/**
	 * 
	 * @return the users
	 */
	public List<UserKey> getUsers() {
		return users;
	}
	public void setUsers(List<UserKey> users) {
		this.users = users;
	}
	/**
	 * @return the name
	 */
	public String getClusterName() {
		return this.getClusterKey().getClusterName();
	}
	/**
	 * @param name the name to set
	 */
	public void setClusterName(String name) {
		this.getClusterKey().setClusterName(name);
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the clusterType
	 */
	public ClusterType getClusterType() {
		return clusterType;
	}
	/**
	 * @param clusterType the clusterType to set
	 */
	public void setClusterType(ClusterType clusterType) {
		this.clusterType = clusterType;
	}
	/**
	 * @return the netTickTime
	 */
	public Long getNetTickTime() {
		return netTickTime;
	}
	/**
	 * @param netTickTime the netTickTime to set
	 */
	public void setNetTickTime(Long netTickTime) {
		this.netTickTime = netTickTime;
	}
	public ClusterKey getClusterKey() {
		return clusterKey;
	}
	public void setClusterKey(ClusterKey clusterKey) {
		this.clusterKey = clusterKey;
	}
	public UserKey getOwner() {
		return owner;
	}
	public void setOwner(UserKey owner) {
		this.owner = owner;
	}
	public Vhost getvHost() {
		return vHost;
	}
	public void setvHost(Vhost vHost) {
		this.vHost = vHost;
	}
	public List<Vhost> getVhosts() {
		return vhosts;
	}
	public void setVhosts(List<Vhost> vhosts) {
		this.vhosts = vhosts;
	}
	/**
	 * @return the federationUpstreams
	 */
	public List <FederationUpstream> getFederationUpstreams() {
		return federationUpstreams;
	}
	/**
	 * @param federationUpstreams the federationUpstreams to set
	 */
	public void setFederationUpstreams(List <FederationUpstream> federationUpstreams) {
		this.federationUpstreams = federationUpstreams;
	}
	/**
	 * @return the policies
	 */
	public List<Policy> getPolicies() {
		return policies;
	}
	/**
	 * @param policies the policies to set
	 */
	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}
	@Override
	public ClusterKey getKey() {
       return this.clusterKey;
	}
	public ProjectKey getProject() {
		return project;
	}
	public void setProject(ProjectKey project) {
		this.project = project;
	}
	public List<NodeKey> getNodes() {
		return nodes;
	}
	public void setNodes(List<NodeKey> nodes) {
		this.nodes = nodes;
	}

}
