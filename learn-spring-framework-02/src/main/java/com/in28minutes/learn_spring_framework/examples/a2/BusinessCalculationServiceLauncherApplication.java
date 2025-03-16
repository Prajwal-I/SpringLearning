package com.in28minutes.learn_spring_framework.examples.a2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration 
@ComponentScan
public class BusinessCalculationServiceLauncherApplication {


	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext
				(BusinessCalculationServiceLauncherApplication.class)) {
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			int res = context.getBean(BusinessCalculationService.class).findMax();
			System.out.println(res);
		}

	}

}
	
