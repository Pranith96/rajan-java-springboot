package com.student.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer studentId;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "mobile_number")
	private String mobileNumber;
	@Column(name = "email_id")
	private String email;
	@Column(name = "login_id", unique = true, nullable = false)
	private String loginId;
	@Column(name = "password")
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private Address address;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = College.class)
	@JoinColumn(name = "college_id")
	private College college;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course", joinColumns = { @JoinColumn(name = "student_id") }, inverseJoinColumns = {
			@JoinColumn(name = "course_id") })
	private List<Course> course;

	@Enumerated(EnumType.STRING)
	private Status status;

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
