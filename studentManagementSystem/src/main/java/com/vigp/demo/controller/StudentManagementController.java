package com.vigp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vigp.demo.model.Student;
import com.vigp.demo.service.StudentService;

@RestController
public class StudentManagementController {

	@Autowired
	private StudentService studentService;

	
	@GetMapping("/v1/students")
	public List<Student> listStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("v1/student/{id}")  
	private Student getStudent(@PathVariable("id") long id)   
	{  
	return studentService.getStudentById(id);  
	}  
	
	@PostMapping("/v1/student")  
	private long saveStudent(@RequestBody Student student)   
	{  
	studentService.saveStudent(student);  
	return student.getId(); 
	}  
	
	@PutMapping("/v1/student")  
	private long updateStudent(@RequestBody Student student)   
	{  
	studentService.updateStudent(student);  
	return student.getId(); 
	}  
	
	@DeleteMapping("/v1/student/{id}")  
	private void deleteStudent(@PathVariable("id") long id)   
	{  
	studentService.deleteStudentById(id);  
	}  
	
}
