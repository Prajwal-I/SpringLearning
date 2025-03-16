package com.in28minutes.learn_spring_framework.examples.a2;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

	public int[] retriveData() {
		return new int[] {1,2,3,4,5};
	}

}
