package com.qa1.appium3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

import org.testng.annotations.Test;

public class Dbconnection {

	@Test
	public void executeQuery() throws ClassNotFoundException, SQLException{
		Class.forName("com. mysql. cj. jdbc.");//setting the driver
		
		//connection to a database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SELFIE_UAT1","nithin.mu ", "87NnW%8le@MOc6CA7");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from xoOutletRegistration");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) +" " +rs.getString(3));
		}
	}

}
 