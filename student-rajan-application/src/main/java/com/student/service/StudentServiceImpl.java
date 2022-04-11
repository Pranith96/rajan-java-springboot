package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.entity.Status;
import com.student.entity.Student;
import com.student.exceptions.StudentNotFoundException;
import com.student.repository.StudentRepository;

@Primary
@Service("service1")
@Profile(value = { "dev", "local", "prod", "qa" })
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String saveStudent(Student student) {
		student.getAddress().setStudent(student);
		student.setStatus(Status.ACTIVE);
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
			throw new StudentNotFoundException("Data is Empty");
		}
		return studentsList;
	}

	@Override
	public Student getStudentData(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new StudentNotFoundException("Data is not found for provided details");
		}
		return response.get();
	}

	@Override
	public List<Student> getStudentDetailsByName(String studentName) {
		// List<Student> response = studentRepository.findByStudentName(studentName);
		List<Student> response = studentRepository.getDetailsByName(studentName);
		if (response == null) {
			throw new StudentNotFoundException("Data is Empty");
		}

		return response;
	}

	@Override
	public Student loginStudent(String loginId, String password) {
		Optional<Student> response = studentRepository.findByLoginIdAndPassword(loginId, password);
		if (!response.isPresent()) {
			throw new StudentNotFoundException("Data is InCorrect for login");
		}
		return response.get();
	}

	@Override
	public String updateDetails(Student student) {
		Student response = getStudentData(student.getStudentId());

		if (student.getStudentName() != null && !student.getStudentName().isBlank()) {
			response.setStudentName(student.getStudentName());
		}
		if (student.getEmail() != null && !student.getEmail().isBlank()) {
			response.setEmail(student.getEmail());
		}
		if (student.getMobileNumber() != null && !student.getMobileNumber().isBlank()) {
			response.setMobileNumber(student.getMobileNumber());
		}
		if (student.getLoginId() != null && !student.getLoginId().isBlank()) {
			response.setLoginId(student.getLoginId());
		}
		if (student.getPassword() != null && !student.getPassword().isBlank()) {
			response.setPassword(student.getPassword());
		}
		studentRepository.save(response);
		return "updated successfully";
	}

	@Transactional
	@Override
	public String updateStudentByName(String studentName, Integer studentId) {
		studentRepository.updateStudentName(studentName, studentId);
		return "Updated Name Successfully";
	}

	@Override
	public String deleteStudentData(Integer studentId) {
		Student response = getStudentData(studentId);
		if (response != null) {
			// studentRepository.deleteById(studentId);
			studentRepository.delete(response);
		}
		return "deleted successfuly";
	}

}
