package ru.examples.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestConfig.class)
public class LogTest {
	
	@Autowired
	Logger log;
	
	@Test
	public void debug() {
		assertNotNull(log);
		log.debug("test DEBUG!");
	}
	
	@Test
	public void info() {
		assertNotNull(log);
		log.info("test INFO!");
	}
	
	@Test
	public void warn() {
		assertNotNull(log);
		log.warn("test WARN!");
	}
	
	@Test
	public void error() {
		assertNotNull(log);
		log.error("test ERROR!");
	}

}
