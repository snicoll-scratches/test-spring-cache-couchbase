package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableCaching
public class SampleApplication {

	private static final Logger logger = LoggerFactory.getLogger(SampleApplication.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SampleApplication.class);

		FooService service = context.getBean(FooService.class);

		logger.info("-----------------------------------------------");
		logger.info("-----------------------------------------------");
		logger.info("-----------------------------------------------");
		logger.info("-----------------------------------------------");
		logger.info("Retrieved " + service.findById(0));
		logger.info("Retrieved " + service.findById(0));
		logger.info("Retrieved " + service.findById(0));
		logger.info("Retrieved " + service.findById(0));
		logger.info("-----------------------------------------------");
		logger.info("-----------------------------------------------");
		logger.info("-----------------------------------------------");
		logger.info("-----------------------------------------------");

		context.close();
	}

}
