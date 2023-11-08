package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student=new Student();
		student.setCity(rs.getString("city"));
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		return student;
	}

}
