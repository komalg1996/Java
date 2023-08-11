package com.courses.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.dao.CourseDao;
import com.courses.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{


	
	
	//temporary list insted of dao / database layer
//	List<Course> list;
	
	//when u make dao layer
	@Autowired
	private CourseDao coursDao;
	
	//default constr
	public CourseServiceImpl() {
//		list = new ArrayList<Course>();
//		list.add(new Course(11,"java","this is beginers course"));
//		list.add(new Course(12,"spring boot","complete spring boot"));
	}
	
	
	
	@Override
	public List<Course> getCourses() {
		
		return coursDao.findAll();
	}



	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		
		return coursDao.getOne(courseId);
	}



	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		coursDao.save(course);
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//			
//		});
		
		coursDao.save(course);
		return course;
	}



	@Override
	public void deleteCourse(long parseLong) {
//			list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=coursDao.getOne(parseLong);
		coursDao.delete(entity);
		
	}

}
