package com.rmqclustermgr.model.persistence;

import java.io.Serializable;

public interface ModelGenericIfc<T> extends Serializable {

	public T getKey();
	
}
