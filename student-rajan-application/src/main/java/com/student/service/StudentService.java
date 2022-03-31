package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	String saveStudent(Student student);

	List<Student> getStudentList();

	Student getStudentData(Integer studentId);

	List<Student> getStudentDetailsByName(String studentName);

	Student loginStudent(String loginId, String password);

	String updateDetails(Student student);

	String updateStudentByName(String studentName, Integer studentId);

	String deleteStudentData(Integer studentId);

}
