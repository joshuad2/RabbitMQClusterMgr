package com.rmqclustermgr.model.persistence;

public class ProjectKey implements ModelGenericIfc<String> {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectKey other = (ProjectKey) obj;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7113861775363800349L;
	private String projectName;
	
	@Override
	public String getKey() {
		return this.getProjectName();
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	
}
