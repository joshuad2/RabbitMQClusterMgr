/**
 * 
 */
package com.rmqclustermgr.model.persistence;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;


/**
 * @author Joshua Davis
 *
 */
@Region("rabbitmqNode")
public class Node implements ModelGenericIfc<NodeKey> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4119364448466626948L;

	@Id
	private NodeKey key;
	private String rabbitMQVersion;
	private String rabbitMQNodeType;//File or Memory
	private float memoryHighWaterMark;
	private float highWatermarkPagingRatio;
	private Long diskFreeLimit;
	private float memRelative;
	private Long systemMemory;
	private String ipAddress;
	private Integer port;
	private String tcpListeners;
	private Long handshakeTimeout;
	private Long logLevels;
	private Long frameMax;
	private Long channelMax;
	private Integer heartbeat;
	private String defaultVhost;
	private String defaultUser;
	private String defaultPass;
	private String defaultUserTags;
	private String defaultPermissions;
	private String collectStatistics;
	private Long collectStatisticsInterval;
	
	public Node(String nodeName, ClusterKey cluster, VhostKey vhost ){
		NodeKey nodeKey=new NodeKey();
		nodeKey.setCluster(cluster);
		nodeKey.setNodeName(nodeName);
		nodeKey.setVhost(vhost);
		this.key=nodeKey;
	}
	
	private UserKey owner;
	/**
	 * @return the name
	 */
	public String getName() {
		return this.key.getNodeName();
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.getKey().setNodeName(name);;
	}
	/**
	 * @return the rabbitMQVersion
	 */
	public String getRabbitMQVersion() {
		return rabbitMQVersion;
	}
	/**
	 * @param rabbitMQVersion the rabbitMQVersion to set
	 */
	public void setRabbitMQVersion(String rabbitMQVersion) {
		this.rabbitMQVersion = rabbitMQVersion;
	}
	/**
	 * @return the rabbitMQNodeType
	 */
	public String getRabbitMQNodeType() {
		return rabbitMQNodeType;
	}
	/**
	 * @param rabbitMQNodeType the rabbitMQNodeType to set
	 */
	public void setRabbitMQNodeType(String rabbitMQNodeType) {
		this.rabbitMQNodeType = rabbitMQNodeType;
	}
	/**
	 * @return the queues
	 */
	/**
	 * @return the memoryHighWaterMark
	 */
	public float getMemoryHighWaterMark() {
		return memoryHighWaterMark;
	}
	/**
	 * @param memoryHighWaterMark the memoryHighWaterMark to set
	 */
	public void setMemoryHighWaterMark(float memoryHighWaterMark) {
		this.memoryHighWaterMark = memoryHighWaterMark;
	}
	/**
	 * @return the highWatermarkPagingRatio
	 */
	public float getHighWatermarkPagingRatio() {
		return highWatermarkPagingRatio;
	}
	/**
	 * @param highWatermarkPagingRatio the highWatermarkPagingRatio to set
	 */
	public void setHighWatermarkPagingRatio(float highWatermarkPagingRatio) {
		this.highWatermarkPagingRatio = highWatermarkPagingRatio;
	}
	/**
	 * @return the diskFreeLimit
	 */
	public Long getDiskFreeLimit() {
		return diskFreeLimit;
	}
	/**
	 * @param diskFreeLimit the diskFreeLimit to set
	 */
	public void setDiskFreeLimit(Long diskFreeLimit) {
		this.diskFreeLimit = diskFreeLimit;
	}
	/**
	 * @return the memRelative
	 */
	public float getMemRelative() {
		return memRelative;
	}
	/**
	 * @param memRelative the memRelative to set
	 */
	public void setMemRelative(float memRelative) {
		this.memRelative = memRelative;
	}
	/**
	 * @return the systemMemory
	 */
	public Long getSystemMemory() {
		return systemMemory;
	}
	/**
	 * @param systemMemory the systemMemory to set
	 */
	public void setSystemMemory(Long systemMemory) {
		this.systemMemory = systemMemory;
	}
	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}
	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	/**
	 * @return the port
	 */
	public Integer getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(Integer port) {
		this.port = port;
	}
	/**
	 * @return the tcpListeners
	 */
	public String getTcpListeners() {
		return tcpListeners;
	}
	/**
	 * @param tcpListeners the tcpListeners to set
	 */
	public void setTcpListeners(String tcpListeners) {
		this.tcpListeners = tcpListeners;
	}
	/**
	 * @return the handshakeTimeout
	 */
	public Long getHandshakeTimeout() {
		return handshakeTimeout;
	}
	/**
	 * @param handshakeTimeout the handshakeTimeout to set
	 */
	public void setHandshakeTimeout(Long handshakeTimeout) {
		this.handshakeTimeout = handshakeTimeout;
	}
	/**
	 * @return the logLevels
	 */
	public Long getLogLevels() {
		return logLevels;
	}
	/**
	 * @param logLevels the logLevels to set
	 */
	public void setLogLevels(Long logLevels) {
		this.logLevels = logLevels;
	}
	/**
	 * @return the frameMax
	 */
	public Long getFrameMax() {
		return frameMax;
	}
	/**
	 * @param frameMax the frameMax to set
	 */
	public void setFrameMax(Long frameMax) {
		this.frameMax = frameMax;
	}
	/**
	 * @return the channelMax
	 */
	public Long getChannelMax() {
		return channelMax;
	}
	/**
	 * @param channelMax the channelMax to set
	 */
	public void setChannelMax(Long channelMax) {
		this.channelMax = channelMax;
	}
	/**
	 * @return the heartbeat
	 */
	public Integer getHeartbeat() {
		return heartbeat;
	}
	/**
	 * @param heartbeat the heartbeat to set
	 */
	public void setHeartbeat(Integer heartbeat) {
		this.heartbeat = heartbeat;
	}
	/**
	 * @return the defaultVhost
	 */
	public String getDefaultVhost() {
		return defaultVhost;
	}
	/**
	 * @param defaultVhost the defaultVhost to set
	 */
	public void setDefaultVhost(String defaultVhost) {
		this.defaultVhost = defaultVhost;
	}
	/**
	 * @return the defaultUser
	 */
	public String getDefaultUser() {
		return defaultUser;
	}
	/**
	 * @param defaultUser the defaultUser to set
	 */
	public void setDefaultUser(String defaultUser) {
		this.defaultUser = defaultUser;
	}
	/**
	 * @return the defaultPass
	 */
	public String getDefaultPass() {
		return defaultPass;
	}
	/**
	 * @param defaultPass the defaultPass to set
	 */
	public void setDefaultPass(String defaultPass) {
		this.defaultPass = defaultPass;
	}
	/**
	 * @return the defaultUserTags
	 */
	public String getDefaultUserTags() {
		return defaultUserTags;
	}
	/**
	 * @param defaultUserTags the defaultUserTags to set
	 */
	public void setDefaultUserTags(String defaultUserTags) {
		this.defaultUserTags = defaultUserTags;
	}
	/**
	 * @return the defaultPermissions
	 */
	public String getDefaultPermissions() {
		return defaultPermissions;
	}
	/**
	 * @param defaultPermissions the defaultPermissions to set
	 */
	public void setDefaultPermissions(String defaultPermissions) {
		this.defaultPermissions = defaultPermissions;
	}
	/**
	 * @return the collectStatistics
	 */
	public String getCollectStatistics() {
		return collectStatistics;
	}
	/**
	 * @param collectStatistics the collectStatistics to set
	 */
	public void setCollectStatistics(String collectStatistics) {
		this.collectStatistics = collectStatistics;
	}
	/**
	 * @return the collectStatisticsInterval
	 */
	public Long getCollectStatisticsInterval() {
		return collectStatisticsInterval;
	}
	/**
	 * @param collectStatisticsInterval the collectStatisticsInterval to set
	 */
	public void setCollectStatisticsInterval(Long collectStatisticsInterval) {
		this.collectStatisticsInterval = collectStatisticsInterval;
	}
	@Override
	public NodeKey getKey() {
       return this.key;
	}
	public UserKey getOwner() {
		return owner;
	}
	public void setOwner(UserKey owner) {
		this.owner = owner;
	}
	public void setKey(NodeKey key) {
		this.key = key;
	}
	public String getNodeName() {
		return key.getNodeName();
	}
	public void setNodeName(String nodeName) {
		key.setNodeName(nodeName);
	}
	public ClusterKey getCluster() {
		return key.getCluster();
	}
	public void setCluster(ClusterKey cluster) {
		key.setCluster(cluster);
	}
	public VhostKey getVhost() {
		return key.getVhost();
	}
	public void setVhost(VhostKey vhost) {
		key.setVhost(vhost);
	}

}
