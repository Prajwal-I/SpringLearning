package com.in28minutes.learn_spring_frameword.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class App02HelloWorldConfiguration {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class);) {
			
//			System.out.println(context);
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));


			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean(Person.class));

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


			
		}
	}

}
