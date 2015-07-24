package com.rmqclustermgr.model.persistence;

public class QueueBindingKey implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8830364454735591016L;

	private QueueKey queue;
	private ExchangeKey exchange;
	private UserKey owner;
	private VhostKey vHost;
	private String bindingExpression;
	private String bindingKey;
	/**
	 * @return the queue
	 */
	public QueueKey getQueue() {
		return queue;
	}
	/**
	 * @param queue the queue to set
	 */
	public void setQueue(QueueKey queue) {
		this.queue = queue;
	}
	/**
	 * @return the exchange
	 */
	public ExchangeKey getExchange() {
		return exchange;
	}
	/**
	 * @param exchange the exchange to set
	 */
	public void setExchange(ExchangeKey exchange) {
		this.exchange = exchange;
	}
	/**
	 * @return the bindingExpression
	 */
	public String getBindingExpression() {
		return bindingExpression;
	}
	/**
	 * @param bindingExpression the bindingExpression to set
	 */
	public void setBindingExpression(String bindingExpression) {
		this.bindingExpression = bindingExpression;
	}
	/**
	 * @return the bindingKey
	 */
	public String getBindingKey() {
		return bindingKey;
	}
	/**
	 * @param bindingKey the bindingKey to set
	 */
	public void setBindingKey(String bindingKey) {
		this.bindingKey = bindingKey;
	}
	public UserKey getOwner() {
		return owner;
	}
	public void setOwner(UserKey owner) {
		this.owner = owner;
	}
	public VhostKey getvHost() {
		return vHost;
	}
	public void setvHost(VhostKey vHost) {
		this.vHost = vHost;
	}
	
}
