package com.student.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByStudentName(String studentName);

	Optional<Student> findByLoginIdAndPassword(String loginId, String password);

	// JPQL query
	// @Query("select s from Student s where s.studentName=:studentName")
	// List<Student> getDetailsByName(String studentName);

	@Query(value = "select * from student_table where student_name=:studentName", nativeQuery = true)
	List<Student> getDetailsByName(String studentName);

	@Modifying
	@Query("update Student s set s.studentName=:studentName where s.studentId=:studentId")
	void updateStudentName(String studentName, Integer studentId);

}