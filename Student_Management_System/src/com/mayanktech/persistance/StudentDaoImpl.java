package com.mayanktech.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mayanktech.daofactory.StudentDaoFactory;
import com.mayanktech.dto.Student;
import com.mayanktech.util.DBConnection;

public class StudentDaoImpl implements RStudentDao {


	@Override
	public String addStudent(Integer sid,String sname, Integer sage, String saddress) throws SQLException {
		
			
		Connection con=DBConnection.getConnection();
		
		String query="insert into dbstudent values(?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1,sid);
		ps.setString(2, sname);
		ps.setInt(3,sage);
		ps.setString(4, saddress);
		
		int rowseffected=ps.executeUpdate();
		System.out.println(rowseffected);

		
		if(rowseffected==1) {
			return "success";
		}
				
	
		return "fail";
		
	}

	@Override
	public Student searchStudent(Integer sid) throws SQLException{
		
			Connection con=DBConnection.getConnection();
			
			String query="select * from dbstudent where sid=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, sid);
	
			ResultSet rs=ps.executeQuery();
			
			Student s=null;
			
			if(rs.next()) {
				s=new Student();
	
				s.setSid(rs.getInt("sid"));
				s.setSname(rs.getString("sname"));
				s.setSage(rs.getInt("sage"));
				s.setSaddress(rs.getString("saddress"));
			}
		   return s;
		
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) throws SQLException{
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		
		String query="update dbstudent set sname=?,sage=?,saddress=? where sid=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, sname);
		ps.setInt(2, sage);
		ps.setString(3, saddress);
		ps.setInt(4, sid);

		
		int rowsaffected=ps.executeUpdate();
		if(rowsaffected==1) {
			return"success";
		}else {
		return "fail";
		}
	}

	@Override
	public String deleteStudent(Integer sid) throws SQLException{
		// TODO Auto-generated method stub
		Connection con=DBConnection.getConnection();
		
		String query="delete from dbstudent where sid=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, sid);
		
		int rows=ps.executeUpdate();
		
		if(rows==1) {
			return "success";
		}else {
			return "fail";
		}
	}

}
