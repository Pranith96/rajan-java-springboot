package com.student.exceptions;

import java.time.LocalDateTime;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleStudentNotFoundException(StudentNotFoundException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDetails("Data in not found");
		response.setMessage(ex.getMessage());
		response.setExceptionCode(HttpStatus.NOT_FOUND.toString());
		response.setDateTime(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<ExceptionResponse> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDetails("Provided Request Incorrect");
		response.setMessage(ex.getMessage());
		response.setExceptionCode(HttpStatus.BAD_REQUEST.toString());
		response.setDateTime(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<ExceptionResponse> handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException ex) {
		ExceptionResponse response = new ExceptionResponse();
		response.setDetails("Provided HttpMethod Request Incorrect");
		response.setMessage(ex.getMessage());
		response.setExceptionCode(HttpStatus.METHOD_NOT_ALLOWED.toString());
		response.setDateTime(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(response);
	}
}
