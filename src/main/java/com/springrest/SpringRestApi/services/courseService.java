package com.springrest.SpringRestApi.services;

import java.util.List;

import com.springrest.SpringRestApi.entities.Course;

public interface courseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	public Course addCourse(Course course);

}
