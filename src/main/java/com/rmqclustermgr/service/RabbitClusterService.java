package com.rmqclustermgr.service;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rmqclustermgr.model.persistence.Cluster;
import com.rmqclustermgr.model.persistence.repository.ClusterJPARepository;
import com.rmqclustermgr.model.persistence.repository.NodeJPARepository;

@Component
public class RabbitClusterService implements InitializingBean {

	@Autowired
	private ClusterJPARepository clusterRepo;
	
	@Autowired
	private NodeJPARepository nodeRepo;
	/**
	 * Get the cluster by Name
	 * @param name
	 * @return
	 */
	public Cluster getClusterByName(String name) {
		List<Cluster> clusters=clusterRepo.findByName(name);
		return clusters.get(0);
	}
	/**
	 * Get the cluster by unique identifier
	 * @param id
	 * @return
	 */
	public Cluster getClusterById(Long id) {
		Cluster cluster=clusterRepo.findOne(id);
		return cluster;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		
	}
 
}
