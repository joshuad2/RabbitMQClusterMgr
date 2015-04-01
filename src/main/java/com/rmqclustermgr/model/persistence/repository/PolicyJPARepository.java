package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rmqclustermgr.model.persistence.Policy;
@RepositoryRestResource(collectionResourceRel="policy",path="policy")
public interface PolicyJPARepository extends JpaRepository<Policy, Long> {

}
