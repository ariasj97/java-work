package com.app.main;

import org.apache.log4j.Logger;

import com.app.service.HelloLogService;

public class HelloLog4j {
	

	private static Logger log = Logger.getLogger(HelloLog4j.class);
	
	public static void main(String[] args) {
		log.trace("Hello from TRACE");
		log.debug("Hello from DEBUG");
		log.info("hello from INFO");
		log.warn("hello from WARN");
		log.error("hello from ERROR");
		log.fatal("hello from FATAL");
		
		HelloLogService service= new HelloLogService();
		service.helloLog();

	}

}
