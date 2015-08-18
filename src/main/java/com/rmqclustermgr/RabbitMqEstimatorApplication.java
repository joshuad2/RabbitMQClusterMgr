package com.rmqclustermgr;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.gemfire.CacheFactoryBean;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;


@Configuration
@ImportResource(value="spring-config.xml")
@EnableGemfireRepositories
@ComponentScan(basePackages = {"com.rmqclustermgr"})
@EnableAutoConfiguration
public class RabbitMqEstimatorApplication {

    @Bean
    CacheFactoryBean cacheFactoryBean() {
        return new CacheFactoryBean();
    }

    public static void main(String[] args) {
    	SpringApplication app=new SpringApplication(RabbitMqEstimatorApplication.class);
    	app.setShowBanner(false);
    	app.run(args);
    }
}
