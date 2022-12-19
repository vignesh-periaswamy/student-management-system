package com.vigp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.vigp.demo.dao.StudentRepository;
import com.vigp.demo.exception.CustomException;
import com.vigp.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		Student std = studentRepository.findById(id).get();
		if(ObjectUtils.isEmpty(std))
			throw new CustomException(HttpStatus.NOT_FOUND,"Student not found.");
		return std;
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
