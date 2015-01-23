package edu.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig {
	
	@Bean
	public String hello() {
		return "Hello!";
	}

}
