package com.rmqclustermgr.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rmqclustermgr.rest.HttpClientProvider;
import com.rmqclustermgr.rest.HttpContext;
import com.rmqclustermgr.rest.httpclient.BasicAuthHttpClientProvider;
import com.rmqclustermgr.rest.httpclient.SslWithBasicAuthHttpClientProvider;
import com.rmqclustermgr.rest.mgmt.BindingOperations;
import com.rmqclustermgr.rest.mgmt.ConnectionOperations;
import com.rmqclustermgr.rest.mgmt.ExchangeOperations;
import com.rmqclustermgr.rest.mgmt.FederationOperations;
import com.rmqclustermgr.rest.mgmt.NodeOperations;
import com.rmqclustermgr.rest.mgmt.ParameterOperations;
import com.rmqclustermgr.rest.mgmt.PermissionOperations;
import com.rmqclustermgr.rest.mgmt.QueueOperations;
import com.rmqclustermgr.rest.mgmt.UserOperations;
import com.rmqclustermgr.rest.mgmt.VirtualHostOperations;
import com.rmqclustermgr.rest.mgmt.model.Overview;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;

public class RabbitNodeMgmtService {
	
	private static final Logger logger = LoggerFactory.getLogger(RabbitNodeMgmtService.class);
	
	private HttpClientProvider httpClientProvider;
	private String hostname;
	private int port;
	private HttpContext httpContext;
	
	public RabbitNodeMgmtService and() {
		return this;
	}
	public RabbitNodeMgmtService(){}
	/**
	 * constructor
	 * @param hostname
	 * @param port
	 * @param httpClientProvider
	 */
	public RabbitNodeMgmtService(String hostname, int port, HttpClientProvider httpClientProvider){
		this.hostname = hostname;
		this.port = port;
		this.httpClientProvider = httpClientProvider;
	}
	
	/**
	 * This needs to be called when you are done setting config properties.
	 */
	public RabbitNodeMgmtService initialize(){
		logger.info("RabbitNodeMgmtService starting to initialize");
		Client client = httpClientProvider.getClient();
        String protocol = (httpClientProvider.useSsl())? "https" : "http";
		httpContext = new HttpContext(client, protocol, hostname, port);
		logger.info("RabbitNodeMgmtService initialized.");
		return this;
	}
	
	/**
	 * Set the client provider.
	 * @param httpClientProvider Interface that allows you to generically configure
	 * the underlying Jersey Client provider.
	 */
	public void setHttpClientProvider(HttpClientProvider httpClientProvider) {
		this.httpClientProvider = httpClientProvider;
	}

	/**
	 * Set the name of the RabbitMQ broker with the MGMT console to connect to.
	 * @param hostname DNS name of the host.
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	/**
	 * Set the port of the RabbitMQ Management Console.
	 * @param port Port of the RabbitMQ Management Console.
	 */
	public void setPort(int port) {
		this.port = port;
	}
	
	/**
	 * Get the HttpContext we're using to make calls and
	 * deserialize payloads.
	 * @return HttpContext
	 */
	public HttpContext getHttpContext(){
		return this.httpContext;
	}
	
	/**
	 * Get the overview for this node.
	 * @return Overview of the node with stats about usage.
	 */
	public Overview overview(){
        checkInitialize();
		return this.httpContext.GET("/overview", new GenericType<Overview>(){}).get();
	}
	
	/**
	 * Get operations related to exchanges.
	 * @return Exchange Operations
	 */
	public ExchangeOperations exchanges(){
        checkInitialize();
        return new ExchangeOperations(this.getHttpContext(),this);
	}
	
	/**
	 * Get operations related to queues.
	 * @return Queue Operations
	 */
	public QueueOperations queues(){
        checkInitialize();
        return new QueueOperations(this.getHttpContext(),this);
	}
	
	/**
	 * Get operations related to vhosts.
	 * @return VHost Operations
	 */
	public VirtualHostOperations vhosts(){

        checkInitialize();

        return new VirtualHostOperations(httpContext, this);
	}
	
	
	/**
	 * Get operations related to users.
	 * @return User Operations
	 */
	public UserOperations users(){
        checkInitialize();
        return new UserOperations(httpContext, this);
	}
	
	/**
	 * Get operations related to permissions.
	 * @return Permission Operations
	 */
	public PermissionOperations permissions(){
        checkInitialize();
        return new PermissionOperations(httpContext, this);
	}
	
	/**
	 * Get operations related to nodes.
	 * @return Node Operations
	 */
	public NodeOperations nodes(){
        checkInitialize();
        return new NodeOperations(httpContext, this);
	}
	
	/**
	 * Get operations related to bindings.
	 * @return Binding Operations
	 */
	public BindingOperations bindings(){
        checkInitialize();
        return new BindingOperations(httpContext, this);
	}

    /**
     * Get operations related to parameters.
     * @return Parameter Operations.
     */
    public ParameterOperations parameters(){
        checkInitialize();
        return new ParameterOperations(httpContext, this);
    }

    /**
     * Get operations related to parameters.
     * @return Connection Operations.
     */
    public ConnectionOperations connections(){

        checkInitialize();

        return new ConnectionOperations(httpContext, this);
    }

    /**
     * Get operations related to federating AMQP exchanges and queues between brokers/clusters.
     * @return Federation Operations
     */
    public FederationOperations federation(){

        checkInitialize();

        return new FederationOperations(httpContext, this);
    }

    private void checkInitialize(){

        if (httpContext == null) initialize();
    }

    /**
     * Get a builder for the RabbitMgmtService, which can be a little tedious to configure via constructor.
     * @return AmqpUri instance.
     */
    public static Builder builder(){ return new Builder(); }

    /**
     * Makes RabbitMgmtService construction easier.
  */
    public static class Builder {

    	//these are default values
        private String host = "localhost";
        private int port = 15672;
        private HttpClientProvider provider = new BasicAuthHttpClientProvider("guest", "guest");
        //default values
        
        public Builder host(String host){

            this.host = host;

            return this;
        }

        public Builder port(int port){

            this.port = port;

            return this;
        }

        public Builder credentials(String username, String password){

            this.provider = new BasicAuthHttpClientProvider(username, password);

            return this;
        }

        public Builder credentials(String key, String keyPass, String trust, String username, String password){

            return credentials(key, keyPass, trust, null, username, password);
        }

        public Builder credentials(String key, String keyPass, String trust, String trustPass, String username, String password){

            this.provider = new SslWithBasicAuthHttpClientProvider(key, keyPass, trust, trustPass, username, password);

            return this;
        }

        public RabbitNodeMgmtService build(){

            return new RabbitNodeMgmtService(host, port, provider);
        }
    }
}