package com.rmqclustermgr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rmqclustermgr.model.persistence.Cluster;


@Component
public class EstimatorService {

	@Autowired
	private RabbitClusterService rabbitClusterService;
	

	
	public Cluster collectClusterData(String name) {
		
		Cluster cluster=rabbitClusterService.getClusterByName(name);
        return null;
	}
}
