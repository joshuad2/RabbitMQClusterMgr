package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rmqclustermgr.model.persistence.QueueBinding;
@RepositoryRestResource(collectionResourceRel="queueBinding",path="queueBinding")
public interface QueueBindingJPARepository extends JpaRepository<QueueBinding, Long> {

}
