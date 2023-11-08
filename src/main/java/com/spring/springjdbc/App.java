package com.spring.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
    	StudentDao studentDao = context.getBean("studentDaoImpl",StudentDao.class);
    	
//    	Student student=new Student();
//    	student.setId(1236);
//    	student.setName("chumkesh");
//    	student.setCity("bangla");
//    	int update =studentDao.insert(student);
//    	int update = studentDao.Update(student);
    	
//    	int delete = studentDao.delete(2);
//    	System.out.println("no of rows deleted are: "+delete);
    	
    	
    	List<Student> students = studentDao.getStudents();
    	    for(Student s:students) System.out.println(s);	
    }
}
