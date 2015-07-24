package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.rmqclustermgr.model.persistence.Exchange;
import com.rmqclustermgr.model.persistence.ExchangeKey;

public interface ExchangeRepository extends CrudRepository<Exchange, ExchangeKey> {

}
