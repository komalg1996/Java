package com.courses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
