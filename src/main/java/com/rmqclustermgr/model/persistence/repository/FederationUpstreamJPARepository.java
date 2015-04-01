package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rmqclustermgr.model.persistence.FederationUpstream;
@RepositoryRestResource(collectionResourceRel="federationUpstream",path="federationUpstream")
public interface FederationUpstreamJPARepository extends JpaRepository<FederationUpstream, Long> {

}
