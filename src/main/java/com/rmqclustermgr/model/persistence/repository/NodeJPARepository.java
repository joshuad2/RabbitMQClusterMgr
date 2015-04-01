package com.rmqclustermgr.model.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rmqclustermgr.model.persistence.Node;
@RepositoryRestResource(collectionResourceRel="node",path="node")
public interface NodeJPARepository extends JpaRepository<Node, Long> {

}
