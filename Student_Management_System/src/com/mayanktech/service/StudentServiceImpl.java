package com.mayanktech.service;

import java.sql.SQLException;

import com.mayanktech.daofactory.StudentDaoFactory;
import com.mayanktech.dto.Student;
import com.mayanktech.persistance.RStudentDao;
import com.mayanktech.servicefactory.StudentServiceFactory;

public class StudentServiceImpl implements RStudentService{
    RStudentDao std=StudentDaoFactory.getStudentDao();
    
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String addStudent(Integer sid,String sname, Integer sage, String saddress) throws SQLException {
		return std.addStudent(sid, sname, sage, saddress);
		
	}

	@Override
	public Student searchStudent(Integer sid) throws SQLException{
		// TODO Auto-generated method stub
	  return std.searchStudent(sid);
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) throws SQLException{
		// TODO Auto-generated method stub
		 return std.updateStudent(sid, sname, sage, saddress);
	}

	@Override
	public String deleteStudent(Integer sid) throws SQLException{
		// TODO Auto-generated method stub
		return std.deleteStudent(sid);
	}

}
