package com.in28minutes.learn_spring_framework.examples.a2;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	private DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		int[] data = this.dataService.retriveData();
		return Arrays.stream(data).max().orElse(0);
	}
	
}
