package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query="insert into student values(?,?,?)";
		int result = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}

	public int Update(Student student) {
		// Updating
		String query="update student set name=?,city=? where id=?";
		int update = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return update;
	}	
	
	public int delete(int studentId) {
		// deleting
		String query="delete from student where id=?";
		int delete = this.jdbcTemplate.update(query,studentId);
		return delete;
	}	
	
	
	public Student student(int studentId) {
		// Getting single Student Object
		String query="select * from student where id=?";
		RowMapperImpl rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}
	
	public List<Student> getStudents() {
		
		String queri="select * from student";
		RowMapperImpl rowMapper = new RowMapperImpl();
		List<Student> students = this.jdbcTemplate.query(queri,rowMapper);
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
