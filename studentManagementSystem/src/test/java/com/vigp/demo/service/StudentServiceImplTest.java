package com.vigp.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.vigp.demo.dao.StudentRepository;
import com.vigp.demo.model.Student;
import com.vigp.demo.studentManagementSystem.TestHelper;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest extends TestHelper{
	
	@InjectMocks
	private StudentServiceImpl studentService;
	
	@Mock
	private StudentRepository studentRepository;
	
	@Test
	void testSaveSuccess() {
		when(studentRepository.save(s1)).thenReturn(s1);
		Student student = studentService.saveStudent(s1);
		assertThat(student.equals(s1));
	}
	
	@Test
	void testGetStudentByIdSuccess() {
		when(studentRepository.findById(s1.getId())).thenReturn(s2);
		Student student = studentService.getStudentById(s1.getId());
		assertThat(student.getId() == s1.getId());
	}
	
	@Test
	void testGetStudentByIdMobNoNull() {
		when(studentRepository.findById(s1NullMobNo.getId())).thenReturn(s1NullMobNoOpt);
		Student student = studentService.getStudentById(s1NullMobNo.getId());
		assertThat(student.getMobileNo() == null );
	}
	
	@Test
	void testGetStudentByIdSchoolNameNull() {
		when(studentRepository.findById(s1NullSchoolName.getId())).thenReturn(s1NullSchoolNameOpt);
		Student student = studentService.getStudentById(s1NullSchoolName.getId());
		assertThat(student.getSchoolName() == null);
	}
	

}
