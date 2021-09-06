package com.springrest.SpringRestApi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRestApi.entities.Course;
import com.springrest.SpringRestApi.services.courseService;

@RestController
public class MyController {
	
	@Autowired
	private courseService courseservice;
	
	
	@GetMapping("/home")
	public String home() {
		
		
		return "This is home page";
	}

	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseservice.getCourses();	
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path="/courses",consumes="application/JSON")
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseservice.addCourse(course);
	}
	
	
}
