package com.rmqclustermgr.model.persistence.repository;

import java.util.List;

import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rmqclustermgr.model.persistence.Cluster;

@RepositoryRestResource(collectionResourceRel="cluster",path="cluster")
public interface ClusterJPARepository extends JpaRepository<Cluster, Long> {
     @Query
	 List<Cluster> findByName(String lastname);
}
