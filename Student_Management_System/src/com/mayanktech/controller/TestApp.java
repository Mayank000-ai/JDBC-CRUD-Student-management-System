package com.mayanktech.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.mayanktech.dto.Student;
import com.mayanktech.service.RStudentService;
import com.mayanktech.servicefactory.StudentServiceFactory;

public class TestApp {

    public static void main(String[] args) throws SQLException {

        RStudentService studentService = StudentServiceFactory.getStudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3 update student");
            System.out.println("4.delete student");
            System.out.println("5. Exit");
            

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter sid:");
                    int id = sc.nextInt();
                   
                    System.out.println("Enter name:");
                    String name = sc.next();

                    System.out.println("Enter city:");
                    String address = sc.next();

                    System.out.println("Enter age:");
                    int age = sc.nextInt();

                    studentService.addStudent(id, name, age, address);
                    System.out.println("Data Added successfully");
                 
                    break;

                case 2:
                    System.out.println("Enter sid:");
                    int id1 = sc.nextInt();

                    Student s=studentService.searchStudent(id1);
                    if(s!=null) {
                    	System.out.println(s);
                    }else {
                    	System.out.println("student not found");
                    }
                 
                    break;
                    
                case 3:
                	System.out.println("Enter id to update:");
                	int uid=sc.nextInt();
                	System.out.println("Enter name");
                	String uname=sc.next();
                	System.out.println("Enter age");
                	int uage=sc.nextInt();
                	System.out.println("Enter address: ");
                	String uaddress=sc.next();
                	
                	String result=studentService.updateStudent(uid,uname, uage, uaddress);
                	if(result.equals("success")) {
                		System.out.println("Updated successfully");
                	}else {
                		System.out.println("Not found");
                	}
                	
                case 4:
                	System.out.println("Enter the id you want to delete");
                	Integer deleteId=sc.nextInt();
                	
                	String status=studentService.deleteStudent(deleteId);
                	if(status.equals("success")) {
                		System.out.println("deleted successfully");
                	}else {
                		System.out.println("Not found");
                	}
                	break;
                	
  

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}