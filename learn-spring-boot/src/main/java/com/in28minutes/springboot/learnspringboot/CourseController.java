package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses
//[
//	{
//		"id":"1",
//		"name":"Learn Java",
//		"author" : "In28Minutes"
//	}
//]

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn Java","In28Minutes"),
				new Course(2,"Learn AWS","In28Minutes"),
				new Course(2,"Learn Azure","In28Minutes"),
				new Course(2,"Learn GCP","In28Minutes")
				);
	}
	
}











