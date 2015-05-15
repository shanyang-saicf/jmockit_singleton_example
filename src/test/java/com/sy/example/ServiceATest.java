package com.sy.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import mockit.Expectations;
import mockit.Mocked;

import org.junit.Before;
import org.junit.Test;

public class ServiceATest {
	@Mocked
	SingletonGenerator singletonGenerator;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testProcessNumber() {
		try {
			new Expectations() {{
				SingletonGenerator.newInstance(); result = singletonGenerator;
				singletonGenerator.getRandomNumber(); result = 1024;
			}};
		} catch (Exception e) {
			fail("Unable to create Expectations:" + e.getMessage());
		}
		
		ServiceA service = new ServiceA();
		long num = service.processNumber();
		assertTrue(num % 2 == 0);
	}
}
