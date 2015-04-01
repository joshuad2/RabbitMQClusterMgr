package com.rmqclustermgr.rest.mgmt;

import java.util.Collection;

import com.google.common.base.Optional;
import com.rmqclustermgr.rest.HttpContext;
import com.rmqclustermgr.rest.mgmt.model.Permission;
import com.rmqclustermgr.service.RabbitNodeMgmtService;



public class PermissionOperations extends BaseFluent {


	public PermissionOperations(HttpContext http,
			RabbitNodeMgmtService mgmtService) {
		super(http, mgmtService);
	}

	public Collection<Permission> all(){
		
		return this.getHTTP().GET("/permissions", PERMISSION_COLLECTION).get();
	}
	
	public Optional<Permission> get(String user){
		
		return get("/", user);
	}
	
	public Optional<Permission> get(String vhost, String user){
		
		return this.getHTTP().GET(String.format("/permissions/%s/%s", encodeSlashes(vhost), user),  PERMISSION);
	}
	
	public PermissionOperations set(Permission permission){
		
		this.getHTTP().PUT(String.format("/permissions/%s/%s", 
			encodeSlashes(permission.getVhost()), permission.getUser()), permission);
		
		return this;
	}
	
	public PermissionOperations remove(String user){
		
		return remove(user);
	}
	
	public PermissionOperations remove(String vhost, String user){
		
		String url = String.format("/permissions/%s/%s", encodeSlashes(vhost), user);
		
		this.getHTTP().DELETE(url);
		
		return this;
	}
	
}
