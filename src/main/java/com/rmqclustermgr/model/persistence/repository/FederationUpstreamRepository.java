package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.rmqclustermgr.model.persistence.FederationUpstream;
import com.rmqclustermgr.model.persistence.FederationUpstreamKey;

public interface FederationUpstreamRepository extends CrudRepository<FederationUpstream, FederationUpstreamKey> {

}
