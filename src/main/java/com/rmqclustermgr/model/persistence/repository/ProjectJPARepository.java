package com.rmqclustermgr.model.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rmqclustermgr.model.persistence.Project;

@RepositoryRestResource(collectionResourceRel="project",path="project")
public interface ProjectJPARepository extends JpaRepository<Project, Long> {
	List<Project> findByName(String name);
}
