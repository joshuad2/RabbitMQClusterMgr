package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rmqclustermgr.model.persistence.Queue;

@RepositoryRestResource(collectionResourceRel="queue",path="queue")
public interface QueueJPARepository extends JpaRepository<Queue, Long>{

}
