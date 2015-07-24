package com.rmqclustermgr.model.persistence.repository;


import org.springframework.data.repository.CrudRepository;

import com.rmqclustermgr.model.persistence.Node;
import com.rmqclustermgr.model.persistence.NodeKey;

public interface NodeRepository extends CrudRepository<Node, NodeKey> {

}
