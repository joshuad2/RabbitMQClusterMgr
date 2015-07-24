package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.rmqclustermgr.model.persistence.Policy;
import com.rmqclustermgr.model.persistence.PolicyKey;


public interface PolicyRepository extends CrudRepository<Policy, PolicyKey> {

}
