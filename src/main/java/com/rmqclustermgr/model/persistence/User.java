package com.rmqclustermgr.model.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;

@Region("user")
public class User implements ModelGenericIfc<UserKey> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5158715125686787923L;

	@Id
	private UserKey key;
	private String password;

	public User(String userName, ClusterKey cluster){
		UserKey userKey=new UserKey();
		userKey.setCluster(cluster);
		userKey.setUserName(userName);
		this.key=userKey;
	}
	
	@Override
	public UserKey getKey() {
		return this.key;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setKey(UserKey key) {
		this.key = key;
	}
	
	public String getUserName(){
		return this.getKey().getUserName();
	}
	
	public void setUserName(String userName){
		this.getKey().setUserName(userName);
	}
}
