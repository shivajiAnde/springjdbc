package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int Update(Student student);
	
	public int delete(int studentId);
	
	public Student student(int studentId);
	
	public List<Student> getStudents();
}
