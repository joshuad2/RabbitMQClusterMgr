package com.rmqclustermgr.rest.mgmt;

import java.util.Collection;

import com.google.common.base.Optional;
import com.rmqclustermgr.rest.HttpContext;
import com.rmqclustermgr.rest.mgmt.model.Node;
import com.rmqclustermgr.service.RabbitNodeMgmtService;

public class NodeOperations extends BaseFluent {

	public NodeOperations(HttpContext http, RabbitNodeMgmtService mgmtService) {
		super(http, mgmtService);
	}

	public Collection<Node> all(){
		return this.getHTTP().GET("/nodes", NODE_COLLECTION).get();
	}
	
	public Optional<Node> get(String name){	
		return this.getHTTP().GET(String.format("/nodes/%s", name), NODE);
	}
}
