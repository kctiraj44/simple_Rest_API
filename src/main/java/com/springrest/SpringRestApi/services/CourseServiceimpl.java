package com.springrest.SpringRestApi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.SpringRestApi.entities.Course;

@Service
public class CourseServiceimpl implements courseService {
	
	List<Course> list;
	
	public CourseServiceimpl() {
		list =new ArrayList<>();
		list.add(new Course(14,"Java Core Course","This contain basic of java"));
		list.add(new Course(15,"python Core Course","This contain basic of python"));
	}
	
	
	
	

	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		Course c =null;
		for(Course course:list) {
			
			if(course.getId() == courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}





	@Override
	public Course addCourse(Course course) {
		list.add(course);
		
		
		return course;
	}

}
