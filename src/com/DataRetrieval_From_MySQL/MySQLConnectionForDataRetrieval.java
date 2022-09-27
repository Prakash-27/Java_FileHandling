package com.DataRetrieval_From_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1. Mention the type of DB to be used --> MySQL, Oracle SQL....
 * 2. Create Connection with the DB by giving the DB Details
 * 3. Create a Statement.
 * 4. Execute the Query.
 * 5. Store the result in Result set.
 * 6. Get the results from Result set.
 * 
 * We have to Add External jar called "mysql-connector-java-8.0.30.jar" in build path 
 * Other wise it will throw the java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver
 *
 */

public class MySQLConnectionForDataRetrieval {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/mydatabase");
		                                                    //"jdbc:mysql://localhost:3306/mydatabase","root","root");
		 /*
		  * I got an SQL exception "the server time zone value 'unknown' is unrecognized or represents more than one time zone. 
		  * you must configure either the server or jdbc driver (via the 'servertimezone' configuration property) 
		  * to use a more specific time zone value if you want to utilize time zone support" and 
		  * I fixed using DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/selenium users?serverTimezone=UTC");
          * If anyone encounters the same, Pls use it.                                                   
		  */
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("SELECT * FROM customer");
		
		while(result.next()) {
			System.out.println("ID: " + result.getInt(1) +"  "+"Name: " + result.getString(2) +"  "+"PhoneNumber: " + result.getInt(3)
			+"  "+ "EmailId: " + result.getString(4)+"  "+"Country: "+result.getString(5)+"  "+"City: "+result.getString(6));
		}
		
		
	}

}