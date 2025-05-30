package com.in28minutes.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(
					new Course(1, "Learn SpringBoot", "29mins"),
					new Course(2, "Learn Rust", "30mins"),
					new Course(3, "Learn Golang", "35mins"),
					new Course(4, "Learn Python", "40mins")
				);
	}
}
