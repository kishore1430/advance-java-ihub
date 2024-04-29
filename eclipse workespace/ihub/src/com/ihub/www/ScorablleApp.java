package com.ihub.www;

import java.sql.Connection;
import java.sql.DriverManager;

public class ScorablleApp  {
	public static void main(String[] args)throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		
	}

}
