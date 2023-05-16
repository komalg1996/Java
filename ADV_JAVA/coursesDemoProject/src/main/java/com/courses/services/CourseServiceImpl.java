package com.courses.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.dao.CourseDao;
import com.courses.entities.Course;

@Service
public class CourseServiceImpl implements CourseServices {

	//variable of coursedao
	@Autowired
	private CourseDao coursedao;
	
	
	//temporary list 
	//latr make dao layer
	List<Course> list;
	
	//constructor
	public CourseServiceImpl() {
//		list=new ArrayList<Course>();
//		list.add(new Course(111, " core java ", " contains core java basics "));
//		list.add(new Course(112, " spring boot ", " creating rest api "));
		
	}
	
	@Override
	public List<Course> getCourses() {
		
		return coursedao.findAll();
	}

	
	@Override
	public Course getCourse(long courseId) {
//		Course c=null;
//		for(Course course : list) {
//			if(course.getId()==courseId) {
//				c=course;
//			}
//		}
		
		return coursedao.getById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		coursedao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		coursedao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=coursedao.getById(parseLong);
		coursedao.delete(entity);
	}

	

}
