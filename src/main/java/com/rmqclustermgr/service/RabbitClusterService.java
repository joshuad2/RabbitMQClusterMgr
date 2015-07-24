package com.rmqclustermgr.service;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rmqclustermgr.model.persistence.Cluster;
import com.rmqclustermgr.model.persistence.repository.ClusterRepository;
import com.rmqclustermgr.model.persistence.repository.NodeRepository;

@Component
public class RabbitClusterService implements InitializingBean {

	@Autowired
	private ClusterRepository clusterRepo;
	
	@Autowired
	private NodeRepository nodeRepo;
	/**
	 * Get the cluster by Name
	 * @param name
	 * @return
	 */
	public Cluster getClusterByName(String name) {
		List<Cluster> clusters=clusterRepo.findByClusterName(name);
		return clusters.get(0);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
	}
 
}
