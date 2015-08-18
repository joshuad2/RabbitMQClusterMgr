package com.rmqclustermgr.model.persistence;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.Region;


@Region("project")
public class Project implements ModelGenericIfc<ProjectKey>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7047032196521384883L;

	@Id
	private ProjectKey key;

	/**
	 * Description of the project
	 */
	private String description;
	/**
	 * Name of the creator of the project
	 */
	private String creatorName;
	
	private String analysisType;
	
	private List<ClusterKey> rabbitMQClusters;
	
	private Boolean deployToCloudFoundryService;
	  
	private Boolean deployToCloudFoundryBosh;
	private Boolean deployToDocker;

	
	public Project(String projectName){
		ProjectKey projectKey=new ProjectKey();
		projectKey.setProjectName(projectName);
		this.key=projectKey;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return this.getKey().getProjectName();
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.getKey().setProjectName(name);
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the creatorName
	 */
	public String getCreatorName() {
		return creatorName;
	}
	/**
	 * @param creatorName the creatorName to set
	 */
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	/**
	 * @return the analysisType
	 */
	public String getAnalysisType() {
		return analysisType;
	}
	/**
	 * @param analysisType the analysisType to set
	 */
	public void setAnalysisType(String analysisType) {
		this.analysisType = analysisType;
	}
	/**
	 * @return the rabbitMQClusterNames
	 */
	public List<ClusterKey> getRabbitMQClusters() {
		return rabbitMQClusters;
	}

	public void setRabbitMQClusters(
			List<ClusterKey> rabbitMQClusters) {
		this.rabbitMQClusters = rabbitMQClusters;
	}
	/**
	 * @return the deployToCloudFoundryService
	 */
	public Boolean getDeployToCloudFoundryService() {
		return deployToCloudFoundryService;
	}
	/**
	 * @param deployToCloudFoundryService the deployToCloudFoundryService to set
	 */
	public void setDeployToCloudFoundryService(Boolean deployToCloudFoundryService) {
		this.deployToCloudFoundryService = deployToCloudFoundryService;
	}
	/**
	 * @return the deployToCloudFoundryBosh
	 */
	public Boolean getDeployToCloudFoundryBosh() {
		return deployToCloudFoundryBosh;
	}
	/**
	 * @param deployToCloudFoundryBosh the deployToCloudFoundryBosh to set
	 */
	public void setDeployToCloudFoundryBosh(Boolean deployToCloudFoundryBosh) {
		this.deployToCloudFoundryBosh = deployToCloudFoundryBosh;
	}
	/**
	 * @return the deployToDocker
	 */
	public Boolean getDeployToDocker() {
		return deployToDocker;
	}
	/**
	 * @param deployToDocker the deployToDocker to set
	 */
	public void setDeployToDocker(Boolean deployToDocker) {
		this.deployToDocker = deployToDocker;
	}
	
	public void setKey(ProjectKey key) {
		this.key = key;
	}
	
	@Override
	public ProjectKey getKey() {
      return this.getKey();
	}
}
