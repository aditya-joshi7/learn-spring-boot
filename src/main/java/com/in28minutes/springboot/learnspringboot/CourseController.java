package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retAllCourse(){
		return Arrays.asList(new Course(1,"C+++","Aditya"),new Course(2,"Java","Aditya"));
	}

	@RequestMapping("/students")
	public List<Course> retAllCourse2(){
		System.out.println("In the feature branch");
		return Arrays.asList(new Course(1,"C+++","Aditya"),new Course(2,"Java","Aditya"));

	}
	
}
