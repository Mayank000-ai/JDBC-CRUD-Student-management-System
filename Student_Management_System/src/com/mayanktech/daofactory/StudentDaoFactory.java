package com.mayanktech.daofactory;

import com.mayanktech.persistance.RStudentDao;
import com.mayanktech.persistance.StudentDaoImpl;

public class StudentDaoFactory {

	private StudentDaoFactory() {
		// TODO Auto-generated constructor stub
	}
	private static RStudentDao studentDao=null;
	
	public static RStudentDao getStudentDao() {
		if(studentDao==null) {
			studentDao=new StudentDaoImpl();
		}
		return studentDao;
	}

}
