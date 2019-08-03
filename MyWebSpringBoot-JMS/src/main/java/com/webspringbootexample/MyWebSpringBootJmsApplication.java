package com.webspringbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
@EnableJpaRepositories("com.webspringbootexample")
@EntityScan("com.webspringbootexample")
public class MyWebSpringBootJmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebSpringBootJmsApplication.class, args);
	}

}
