package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rmqclustermgr.model.persistence.ClusterType;
@RepositoryRestResource(collectionResourceRel="clusterType",path="clusterType")
public interface ClusterTypeJPARepository extends JpaRepository<ClusterType, Long> {

}
