package com.in28minutes.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready!");
	}
	
	@PostConstruct
	public void initialize() {
		this.someDependency.initialize();
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("CleanUp");
	}
}

@Component
class SomeDependency {

	public void initialize() {
		System.out.println("Some logic in someDependency");
		
	}
	
}

@Configuration 
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {


	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext
				(PrePostAnnotationContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}
	
