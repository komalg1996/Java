package com.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courses.entities.Course;
import com.courses.services.CourseService;

@RestController
public class MyController {
	
	//here we need obj of courseServiceImpl 
	//asl spring to create obj of CourseServiceImpl and inject it here. ie dependency injection hence use @Autowired

	@Autowired
	public CourseService courseservice;
	
	
	@GetMapping("/home")
	public String home() {
		
		return "This is my new home page of courses";
	}
	
	//get all courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		//controller asks from service layer
		return this.courseservice.getCourses();
	}
	
	//get course by id
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
	
	//add new courses
	@PostMapping("/courses")
	public Course addCousre(@RequestBody Course course) {
		return this.courseservice.addCourse(course);
		
	}
	
	//update course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseservice.updateCourse(course);
	}
	
	//delete
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseservice.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
