package com.example.springjenkinsdemo1;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsdemo1Application {

	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsdemo1Application.class);
	@PostConstruct
	public void init() {
		logger.info("Application started.........froms logger");
	}
	public static void main(String[] args) {
		logger.info("Application executed.........log INFO");
		SpringApplication.run(SpringJenkinsdemo1Application.class, args);
	}

}
