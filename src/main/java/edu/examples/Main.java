package edu.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {		
		
		Logger log = LoggerFactory.getLogger(Main.class);	
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ContextConfig.class);
		
		log.debug("Debug!");
		log.info("Info!");
		log.warn("Warn!");
		log.error("Error!");
		
		log.error((String)ctx.getBean("hello"));

	}

}
