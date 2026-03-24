package com.mayanktech.servicefactory;

import com.mayanktech.service.RStudentService;
import com.mayanktech.service.StudentServiceImpl;

public class StudentServiceFactory {

	private StudentServiceFactory() {
		// TODO Auto-generated constructor stub
	}
	private static RStudentService studentService=null;
	
	public static RStudentService getStudentService() {
		if(studentService==null) {
			studentService=new StudentServiceImpl();
		}
		return studentService;
	}

}
