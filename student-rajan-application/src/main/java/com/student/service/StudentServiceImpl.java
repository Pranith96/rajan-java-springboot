package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String saveStudent(Student student) {
		Student response = studentRepository.save(student);
		if (response == null) {
			return "data not saved";
		}
		return "data saved successfully";
	}

	@Override
	public List<Student> getStudentList() {
		List<Student> studentsList = studentRepository.findAll();
		if (studentsList == null || studentsList.isEmpty()) {
			throw new RuntimeException("Data is Empty");
		}
		return studentsList;
	}

	@Override
	public Student getStudentData(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is not found");
		}
		return response.get();
	}

	@Override
	public List<Student> getStudentDetailsByName(String studentName) {
		//List<Student> response = studentRepository.findByStudentName(studentName);
		List<Student> response = studentRepository.getDetailsByName(studentName);
		if (response == null) {
			throw new RuntimeException("Data is Empty");
		}

		return response;
	}

	@Override
	public Student loginStudent(String loginId, String password) {
		Optional<Student> response = studentRepository.findByLoginIdAndPassword(loginId, password);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is InCorrect");
		}
		return response.get();
	}
}
