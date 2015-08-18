package com.rmqcluster.resource.model;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.rmqclustermgr.model.persistence.Cluster;
import com.rmqclustermgr.model.persistence.ClusterKey;
import com.rmqclustermgr.model.persistence.ClusterType;
import com.rmqclustermgr.model.persistence.FederationUpstream;
import com.rmqclustermgr.model.persistence.NodeKey;
import com.rmqclustermgr.model.persistence.Policy;
import com.rmqclustermgr.model.persistence.ProjectKey;
import com.rmqclustermgr.model.persistence.UserKey;
import com.rmqclustermgr.model.persistence.Vhost;

public class ClusterResource extends ResourceSupport {

	private Cluster cluster;

	public List<UserKey> getUsers() {
		return cluster.getUsers();
	}

	public void setUsers(List<UserKey> users) {
		cluster.setUsers(users);
	}

	public String getClusterName() {
		return cluster.getClusterName();
	}

	public void setClusterName(String name) {
		cluster.setClusterName(name);
	}

	public String getDescription() {
		return cluster.getDescription();
	}

	public void setDescription(String description) {
		cluster.setDescription(description);
	}

	public int hashCode() {
		return cluster.hashCode();
	}

	public ClusterType getClusterType() {
		return cluster.getClusterType();
	}

	public void setClusterType(ClusterType clusterType) {
		cluster.setClusterType(clusterType);
	}

	public Long getNetTickTime() {
		return cluster.getNetTickTime();
	}

	public void setNetTickTime(Long netTickTime) {
		cluster.setNetTickTime(netTickTime);
	}

	public ClusterKey getClusterKey() {
		return cluster.getClusterKey();
	}

	public void setClusterKey(ClusterKey clusterKey) {
		cluster.setClusterKey(clusterKey);
	}

	public UserKey getOwner() {
		return cluster.getOwner();
	}

	public void setOwner(UserKey owner) {
		cluster.setOwner(owner);
	}

	public Vhost getvHost() {
		return cluster.getvHost();
	}

	public void setvHost(Vhost vHost) {
		cluster.setvHost(vHost);
	}

	public List<Vhost> getVhosts() {
		return cluster.getVhosts();
	}

	public void setVhosts(List<Vhost> vhosts) {
		cluster.setVhosts(vhosts);
	}

	public List<FederationUpstream> getFederationUpstreams() {
		return cluster.getFederationUpstreams();
	}

	public void setFederationUpstreams(List<FederationUpstream> federationUpstreams) {
		cluster.setFederationUpstreams(federationUpstreams);
	}

	public List<Policy> getPolicies() {
		return cluster.getPolicies();
	}

	public void setPolicies(List<Policy> policies) {
		cluster.setPolicies(policies);
	}

	public ClusterKey getKey() {
		return cluster.getKey();
	}

	public ProjectKey getProject() {
		return cluster.getProject();
	}

	public void setProject(ProjectKey project) {
		cluster.setProject(project);
	}

	public List<NodeKey> getNodes() {
		return cluster.getNodes();
	}

	public void setNodes(List<NodeKey> nodes) {
		cluster.setNodes(nodes);
	}

	public String toString() {
		return cluster.toString();
	}
	
}
