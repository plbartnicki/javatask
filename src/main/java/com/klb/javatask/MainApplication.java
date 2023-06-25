package com.klb.javatask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MainApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(MainApplication.class);

	@Override
	public void run(String... args) throws Exception {
		logger.info("Starting MainApplication");
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
