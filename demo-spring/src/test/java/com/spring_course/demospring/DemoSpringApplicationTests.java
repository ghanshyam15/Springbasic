package com.spring_course.demospring;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSpringApplicationTests {

	@Before
	public void before() {
		System.out.println("before");
	}
	
	@Test
	public void testsam() {
		
		DemoSpringApplication s=new DemoSpringApplication();
		System.out.println("de");
		String q="car start";
		 assertEquals(10,10);
		
	}

}
