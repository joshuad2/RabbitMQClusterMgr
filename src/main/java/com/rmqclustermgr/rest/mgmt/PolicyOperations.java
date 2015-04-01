package com.rmqclustermgr.rest.mgmt;

import java.util.Collection;

import com.google.common.base.Optional;
import com.rmqclustermgr.rest.HttpContext;
import com.rmqclustermgr.rest.mgmt.model.Policy;
import com.rmqclustermgr.service.RabbitNodeMgmtService;

public class PolicyOperations extends BaseFluent {

	public PolicyOperations(HttpContext http, RabbitNodeMgmtService mgmtService) {
		super(http, mgmtService);
	}


    public Collection<Policy> all(){

        return this.getHTTP().GET("/policies", POLICY_COLLECTION).get();
    }

    public Optional<Collection<Policy>> allOnDefault(){

        return allOnVHost("/");
    }

    public Optional<Collection<Policy>> allOnVHost(String vhost){

        return this.getHTTP().GET(String.format("/policies/%s", encodeSlashes(vhost)), POLICY_COLLECTION);
    }

    public Optional<Policy> get(String vhost, String name){

        return this.getHTTP().GET(String.format("/policies/%s/%s", encodeSlashes(vhost), name), POLICY);
    }

    public PolicyOperations delete(String vhost, String name){

        this.getHTTP().DELETE(String.format("/policies/%s/%s", encodeSlashes(vhost), name));

        return this;
    }

    public PolicyOperations create(String name, Policy policy){

        return create("/", name, policy);
    }

    public PolicyOperations create(String vhost, String name, Policy policy){

        this.getHTTP().PUT(String.format("/policies/%s/%s", encodeSlashes(vhost), name), policy);

        return this;
    }
}
