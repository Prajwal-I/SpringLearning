package com.in28minutes.learn_spring_framework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Lazy
@Component
class ClassB {
	private ClassA classA;
	
	ClassB(ClassA classa) {
		this.classA = classa;
		System.out.println("CLass B Cntr");
	}
	
	public void doSomeThing() {
		System.out.println("ClassB Do Something");
	}
}

@Configuration 
@ComponentScan
public class LazyInitializationLauncherApplication {


	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext
				(LazyInitializationLauncherApplication.class)) {
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(ClassB.class);
		}

	}

}
	
