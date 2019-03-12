package com.spring_course.demospring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("car")
public class Car implements showroom{

	@Override
	public String start() {
	return "car start";
		
	}
}