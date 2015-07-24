package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.rmqclustermgr.model.persistence.QueueBinding;
import com.rmqclustermgr.model.persistence.QueueBindingKey;

public interface QueueBindingRepository extends CrudRepository<QueueBinding, QueueBindingKey> {

}
