package com.mayanktech.persistance;

import java.sql.SQLException;

import com.mayanktech.dto.Student;

public interface RStudentDao {
	
    public String addStudent(Integer sid,String sname , Integer sage,String saddress) throws SQLException;
	
	public Student searchStudent(Integer sid) throws SQLException;
	
	public String updateStudent(Integer sid,String sname,Integer sage,String saddress) throws SQLException;
	
	public String deleteStudent(Integer sid) throws SQLException;
	

}
