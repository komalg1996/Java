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
import com.courses.services.CourseServices;

@RestController
public class MyController {
	// springBoot will create obj of CourseServicesImpl and inject in this class
	@Autowired
	private CourseServices courseservices;

	// mappings
	@GetMapping("/home")
	public String home() {
		return "Welcome prachi to spring boot home page";
	}

	// get all courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return courseservices.getCourses();
	}

	// get 1 course by id
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseservices.getCourse(Long.parseLong(courseId));
	}

	// add new course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseservices.addCourse(course);
	}

	// update course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseservices.updateCourse(course);
	}

	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
			this.courseservices.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
