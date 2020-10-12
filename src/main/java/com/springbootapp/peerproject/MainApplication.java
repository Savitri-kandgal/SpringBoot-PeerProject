package com.springbootapp.peerproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.springbootapp.peerproject"})  // enables all auto configuration,it creates all the objs (scan the @component and @configuration )  
public class MainApplication {

	 private static final Logger LOGGER=LoggerFactory.getLogger(MainApplication.class);
	 
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		
		LOGGER.info("LOGGER : Running main()");
	}

}
