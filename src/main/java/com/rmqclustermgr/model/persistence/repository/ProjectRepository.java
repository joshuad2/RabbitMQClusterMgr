package com.rmqclustermgr.model.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rmqclustermgr.model.persistence.Project;
import com.rmqclustermgr.model.persistence.ProjectKey;

public interface ProjectRepository extends CrudRepository<Project, ProjectKey> {
	List<Project> findByName(String name);
}
