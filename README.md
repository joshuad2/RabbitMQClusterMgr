# RabbitMQClusterMgr
RabbitMQClusterMgr - RabbitMQ configuration management database, provisioner, and heuristic analysis of traffic.<br />
<br />
This project is a result of many discussions around the use and provisioning of RabbitMQ which has become pervasive in the past year. &nbsp;The issue is that when you initially setup RabbitMQ and expose it to the different needs of the business it typically will fail. &nbsp;As the use increases, the setup out of the box does not suffice. &nbsp;This is where the RabbitMQClusterMgr comes into play. &nbsp;The plan is for it to be a small clustered application that will work in a Cloud Foundry, Docker Swarm, Cloud (AWS or GCE) or bare metal environment.<br />
<br />
Note that this code base uses ideas and code snippets from the RabbidManagement project&nbsp;<a href="https://www.blogger.com/null">https://github.com/Berico-Technologies/RabbidManagement</a><br />
<br />
This project is a REST service that provides a set of RESTful endpoints protected by OAuth 2. The REST service is based on the&nbsp;<a href="https://spring.io/guides/gs/rest-service/">Building a RESTful Web Service</a>&nbsp;getting started guide. This project incorporates the new Java-based configuration support, now available in Spring Security OAuth 2.0.<br />
<br />
This project builds virtual RabbitMQ clusters in an internal database through a provided resource based REST interface. This set of clusters is a "Project" which has clusters and then nodes.  The purpose of this is to have one place where a RabbitMQ Federation or just one RabbitMQ cluster configuration and performance statistics can be stored/analyzed. By doing this it enables the provisioning of the cluster through Docker containers that can be performed by via a statistical model based upon a tuned model described by the user or through the default model.  The purpose of the RabbitMQClusterMgr is to sit outside the PAAS or IAAS layer and predict the workload and use the scheduling API's to 
<br />
<ul>
<li>BOSH release</li>
<li>Docker Swarm </li>
<li>Google Kubernetes on Amazon Web Services or Google Compute Engine</li>
<li>Apache Mesos on Amazon Web Services or Google Compute Engine</li>
<li>Apache Brooklyn on Amazon or Google Compute Engine</li>
</ul>
<p>Also, this application will work directly to handle no-downtime maintenance of RabbitMQ clusters on either Kubernetes, Mesos, or Brooklyn via their scheduling plugins/services. 
<div>
The purpose of the RabbitMQClusterMgr service is that once the project is provisioned, it will continually collect heuristic information about the cluster. &nbsp;This would be things like&nbsp;</div>
<div>
<ul>
<li>Drive space and memory used by queues</li>
<li>Memory used by the system overall</li>
<li>Number of Exchanges created</li>
<li>Use of Federation</li>
<li>Use of Shovel</li>
</ul>
<div>
Using the original template by which the project (and it's clusters) are created the RabbitMQClusterMgr will have the capability to automatically create the new cluster in the environments and then transition the load to the new cluster(s). &nbsp;An HAProxy instance will be used to to create the no-downtime upgrade/deployment. &nbsp;In the future it should support hardware based load balancers.</div>
</div>
<div>
<br /></div>
<h2>Dependencies</h2>
<ul>
<li>Apache Geode</li>
<li>Spring Boot</li>
<li>Spring Data GemFire</li>
</ul>