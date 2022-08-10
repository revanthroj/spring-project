package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.service.StudentService;

@RestController
@RequestMapping(value = "/api")
public class StudentController {	

	@Autowired
	private StudentService service;
	
	@PostMapping(value = "/student")
	public String addStudent(@RequestBody Student st) {
		service.createStudent(st);
		return "index.jsp";
	}
	
//	@GetMapping(value = "/student/{rollNo}")
//	public Student getStudent(@PathVariable Long rollNo) {
//		Student student = service.findStudent(rollNo);
//		return student;
//	}
//	
//	@PutMapping(value = "/student/{rollNo}")
//	public Student updateStudent(@PathVariable Long rollNo,@RequestBody Student st) {
//		Student student = service.updateStudent(rollNo, st);
//		return student;
//	}
//	
//	@DeleteMapping(value = "/student/{rollNo}")
//	public String deleteStudent(@PathVariable Long rollNo) {
//		service.deleteStudent(rollNo);
//		return "Student data deleted";
//	}
//	
	
	
	
	
}
