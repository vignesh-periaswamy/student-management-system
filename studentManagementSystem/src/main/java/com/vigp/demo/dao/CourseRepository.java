package com.vigp.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vigp.demo.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
