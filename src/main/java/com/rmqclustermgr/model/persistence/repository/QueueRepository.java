package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.rmqclustermgr.model.persistence.Queue;
import com.rmqclustermgr.model.persistence.QueueKey;


public interface QueueRepository extends CrudRepository<Queue, QueueKey>{

}
