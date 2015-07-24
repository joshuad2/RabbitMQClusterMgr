package com.rmqclustermgr.model.persistence;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;
@Region("rabbitmqQueueBinding")
public class QueueBinding implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 734629199816492629L;
	
@Id
	private QueueBindingKey queueBindingKey;

public QueueBinding(String bindingExpression, String bindingKey, ExchangeKey exchange, UserKey owner, VhostKey vHost, QueueKey queue){
	QueueBindingKey queueBindingKey=new QueueBindingKey();
	queueBindingKey.setBindingExpression(bindingExpression);
	queueBindingKey.setBindingKey(bindingKey);
	queueBindingKey.setExchange(exchange);
	queueBindingKey.setOwner(owner);
	queueBindingKey.setQueue(queue);
	queueBindingKey.setvHost(vHost);
	this.queueBindingKey=queueBindingKey;
}

public QueueBindingKey getQueueBindingKey() {
	return queueBindingKey;
}

public void setQueueBindingKey(QueueBindingKey queueBindingKey) {
	this.queueBindingKey = queueBindingKey;
}

public QueueKey getQueue() {
	return queueBindingKey.getQueue();
}

public void setQueue(QueueKey queue) {
	queueBindingKey.setQueue(queue);
}

public ExchangeKey getExchange() {
	return queueBindingKey.getExchange();
}

public void setExchange(ExchangeKey exchange) {
	queueBindingKey.setExchange(exchange);
}

public String getBindingExpression() {
	return queueBindingKey.getBindingExpression();
}

public void setBindingExpression(String bindingExpression) {
	queueBindingKey.setBindingExpression(bindingExpression);
}

public String getBindingKey() {
	return queueBindingKey.getBindingKey();
}

public void setBindingKey(String bindingKey) {
	queueBindingKey.setBindingKey(bindingKey);
}

public UserKey getOwner() {
	return queueBindingKey.getOwner();
}

public void setOwner(UserKey owner) {
	queueBindingKey.setOwner(owner);
}

public VhostKey getvHost() {
	return queueBindingKey.getvHost();
}

public void setvHost(VhostKey vHost) {
	queueBindingKey.setvHost(vHost);
}

}
