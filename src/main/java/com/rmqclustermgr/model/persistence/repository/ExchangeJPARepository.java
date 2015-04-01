package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rmqclustermgr.model.persistence.Exchange;
@RepositoryRestResource(collectionResourceRel="exchange",path="exchange")
public interface ExchangeJPARepository extends JpaRepository<Exchange, Long> {

}
