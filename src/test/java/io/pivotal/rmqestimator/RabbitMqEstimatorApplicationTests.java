package io.pivotal.rmqestimator;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rmqclustermgr.RabbitMqEstimatorApplication;
import com.rmqclustermgr.model.persistence.Project;
import com.rmqclustermgr.model.persistence.repository.ProjectRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitMqEstimatorApplication.class)
@WebAppConfiguration
public class RabbitMqEstimatorApplicationTests {
	
    @Autowired
    ProjectRepository projectRepo;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreateProject() {
	  Project project=new Project("TEST");
	  project.setAnalysisType("TEST");
	  project.setCreatorName("TEST");
	  project.setDeployToCloudFoundryBosh(true);
	  project.setDeployToDocker(true);
	  project.setDeployToCloudFoundryService(true);
	  project.setName("TESTPROJECT");
	  projectRepo.save(project);
	}
	
	@Test
	public void testCreateExchange() {
		
	}
}
