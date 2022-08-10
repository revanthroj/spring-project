package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.StudentRepository;
import com.springboot.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;

	public void createStudent(Student st) {
		repo.save(st);
		
	}

	public Student findStudent(Long rollNo) {
		Student student = (Student) repo.findById(rollNo).get();
		return student;
	}

	public Student updateStudent(Long rollNo, Student st) {
		Student stu = (Student) repo.findById(rollNo).get();
		stu.setName(st.getName());
		return repo.save(stu);
	}

	public void deleteStudent(Long rollNo) {
		repo.deleteById(rollNo);
	}

}
