package com.spring_course.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class vechile {
	@Autowired
	@Qualifier("car")
	showroom src;


public String main() {
	
	return "hello "+src.start();
}
	
}
