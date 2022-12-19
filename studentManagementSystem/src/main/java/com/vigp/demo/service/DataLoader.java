package com.vigp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.vigp.demo.dao.CourseRepository;
import com.vigp.demo.model.Course;

@Component
public class DataLoader {

	@Autowired
	private CourseRepository courseRepository;
	
	//@EventListener(ApplicationReadyEvent.class) //Not required for now
	public void loadInitialData() {
		courseRepository.save(new Course("1", 0.10));
		courseRepository.save(new Course("2", 1.10));
		courseRepository.save(new Course("3", 2.10));
		courseRepository.save(new Course("4", 3.10));
    }
	
}
