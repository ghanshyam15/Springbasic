package com.spring_course.demospring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bike")
public class Bike implements showroom{

	@Override
	public String start() {
	return "bike start";
		
	}
}