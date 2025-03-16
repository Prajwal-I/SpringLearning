package com.in28minutes.learn_spring_framework.examples.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

	public int[] retriveData() {
		return new int[] {11,22,33,44,55};
	}

}
