package com.in28minutes.learn_spring_frameword.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Bobthebuilder";
	}
	
	@Bean
	public int age() {
		return 16;
	}
	
	@Bean
	public Person person() {
		return new Person("hathavidhi", 42, new Address("9900o0", "Chennapatnam"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	@Primary
	public Person person3Parameters(String name, int age, @Qualifier("addressQualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Address address() {
		return new Address("laal", "punjab");
	}
	
	@Bean
	@Qualifier("addressQualifier")
	public Address addressQual() {
		return new Address("qual", "Qpunjab");
	}
	
	@Bean(name="addr2")
	@Primary
	public Address address2() {
		return new Address("9900o0", "Chennapatnam");
	}
}
