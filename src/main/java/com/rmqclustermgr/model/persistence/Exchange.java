package com.rmqclustermgr.model.persistence;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;

/**
 * @author Joshua Davis
 *
 */
@Region("RabbitmqExchange")
public class Exchange implements ModelGenericIfc<ExchangeKey> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7919296801558044464L;
	@Id
    private ExchangeKey key;
    private String exchangeType;//direct, flow, topic
    private Boolean isFederated;
	private Boolean isLocalExchange;
    private List <QueueBinding> bindings;
	private UserKey owner;
	
	public Exchange(String exchangeName,NodeKey node,VhostKey virtualHost){
		ExchangeKey exchangeKey=new ExchangeKey();
		exchangeKey.setExchangeName(exchangeName);
		exchangeKey.setNode(node);
		exchangeKey.setVirtualHost(virtualHost);
		this.key=exchangeKey;
	}
	
	public String getExchangeName() {
		return key.getExchangeName();
	}
	/**
	 * @param exchangeName the exchangeName to set
	 */
	public void setExchangeName(String exchangeName) {
		this.getKey().setExchangeName(exchangeName);
	}
	/**
	 * @return the exchangeType
	 */
	public String getExchangeType() {
		return exchangeType;
	}
	/**
	 * @param exchangeType the exchangeType to set
	 */
	public void setExchangeType(String exchangeType) {
		this.exchangeType = exchangeType;
	}
	/**
	 * @return the isFederated
	 */
	public Boolean getIsFederated() {
		return isFederated;
	}
	/**
	 * @param isFederated the isFederated to set
	 */
	public void setIsFederated(Boolean isFederated) {
		this.isFederated = isFederated;
	}
	/**
	 * @return the bindings
	 */
	public List<QueueBinding> getBindings() {
		return bindings;
	}
	/**
	 * @param bindings the bindings to set
	 */
	public void setBindings(List<QueueBinding> bindings) {
		this.bindings = bindings;
	}
	@Override
	public ExchangeKey getKey() {
		return this.getKey();
	}
	public Boolean getIsLocalExchange() {
		return isLocalExchange;
	}
	public void setIsLocalExchange(Boolean isLocalExchange) {
		this.isLocalExchange = isLocalExchange;
	}
	public UserKey getOwner() {
		return owner;
	}
	public void setOwner(UserKey owner) {
		this.owner = owner;
	}
	public void setKey(ExchangeKey key) {
		this.key = key;
	}

	public NodeKey getNode() {
		return key.getNode();
	}

	public void setNode(NodeKey node) {
		key.setNode(node);
	}

	public VhostKey getVirtualHost() {
		return key.getVirtualHost();
	}

	public void setVirtualHost(VhostKey virtualHost) {
		key.setVirtualHost(virtualHost);
	}
	
}
