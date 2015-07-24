package com.rmqclustermgr.model.persistence.repository;

import java.util.List;

import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rmqclustermgr.model.persistence.Cluster;
import com.rmqclustermgr.model.persistence.ClusterKey;

public interface ClusterRepository extends CrudRepository<Cluster, ClusterKey> {
     @Query
	 List<Cluster> findByClusterName(String name);
}
