package com.wfhc.app.wfhc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.wfhc.app.controller","com.wfhc.app.service"})
@EnableJpaRepositories("com.wfhc.app.dao")
@EntityScan("com.wfhc.app.bean")
public class WfhcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WfhcApplication.class, args);
	}

}
