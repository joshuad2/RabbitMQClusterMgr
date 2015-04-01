package io.pivotal.rmqestimator;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rmqclustermgr.RabbitMqEstimatorApplication;
import com.rmqclustermgr.model.persistence.Cluster;
import com.rmqclustermgr.model.persistence.ClusterType;
import com.rmqclustermgr.model.persistence.Project;
import com.rmqclustermgr.model.persistence.repository.ClusterTypeJPARepository;
import com.rmqclustermgr.model.persistence.repository.ProjectJPARepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitMqEstimatorApplication.class)
@WebAppConfiguration
public class RabbitMqEstimatorApplicationTests {

	@Autowired
	ClusterTypeJPARepository rabbitMQClusterTypeRepo;
	
    @Autowired
    ProjectJPARepository projectRepo;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreateProject() {
	  Project project=new Project();
	  project.setAnalysisType("TEST");
	  project.setCreatorName("TEST");
	  project.setDeployToCloudFoundryBosh(true);
	  project.setDeployToDocker(true);
	  project.setDeployToCloudFoundryService(true);
	  project.setId(1L);
	  project.setName("TESTPROJECT");
	  project.setRabbitMQClusters(new ArrayList<Cluster>());
	  projectRepo.save(project);
	}
	
	@Test
	public void testCreateRabbitMQCluster() {
		ClusterType clusterType=new ClusterType();
		clusterType.setName("PERSISTENT");
		ClusterType persistent=rabbitMQClusterTypeRepo.save(clusterType);
		Cluster cluster=new Cluster();
		cluster.setClusterType(persistent);
		cluster.setName("TESTCLUSTER");
		cluster.setNetTickTime(1000L);
	}
	
	@Test
	public void testCreateExchange() {
		
	}
}
