package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {

	//@Qualifier(value = "service1")
	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		String response = studentService.saveStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get/all")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> response = studentService.getStudentList();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable("studentId") Integer studentId) {
		Student response = studentService.getStudentData(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/details/{studentName}")
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable("studentName") String studentName) {
		List<Student> response = studentService.getStudentDetailsByName(studentName);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/login/{loginId}/{password}")
	public ResponseEntity<Student> loginStudent(@PathVariable("loginId") String loginId,
			@PathVariable("password") String password) {
		Student response = studentService.loginStudent(loginId, password);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/by/id")
	public ResponseEntity<Student> getStudentById(@RequestParam("studentId") Integer studentId) {
		Student response = studentService.getStudentData(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateStudentDetails(@RequestBody Student student) {
		String response = studentService.updateDetails(student);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/update/details/{studentName}/{studentId}")
	public ResponseEntity<String> updateStudentByName(@PathVariable("studentName") String studentName,
			@PathVariable("studentId") Integer studentId) {
		String response = studentService.updateStudentByName(studentName, studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable("studentId") Integer studentId) {
		String response = studentService.deleteStudentData(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
