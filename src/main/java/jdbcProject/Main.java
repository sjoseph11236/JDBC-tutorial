package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//public class Main {
//
//	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//
////		Setting the driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
////		Connecting the driver to database
//		Connection con = DriverManager
//				  .getConnection("jdbc:mysql://b3e6af9b452e8f:9951edf9@us-cdbr-east-06.cleardb.net(opens in new tab)/heroku_1bf74d9e6c8ddcb?reconnect=true");
//
////		Instantiating object from statement class
//		Statement stmt = con.createStatement();
//		
////		Storing a query in tableSql
//		String tableSql = "CREATE TABLE IF NOT EXISTS employees(emp_id int PRIMARY KEY AUTO_INCREMENT, name varchar(30), position varchar(30), salary double)";
//	
////		Execute the query command.
//		stmt.execute(tableSql);
//		
////		Creating query to insert an employee
//		String insertSql = "INSERT INTO employees(name, position, salary)  VALUES('john', 'developer', 2000)";
//				
////		Execute the query command.
//		stmt.executeUpdate(insertSql);
//
////		Create query to get all employees
//		String selectSql = "SELECT * FROM employees";
////		Instantiate an object from 
//		ResultSet resultSet = stmt.executeQuery(selectSql);
//		
//		System.out.println(resultSet);
//		
//		stmt.close();
//	}
//
//}

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//​
public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://b3e6af9b452e8f:9951edf9@us-cdbr-east-06.cleardb.net/heroku_1bf74d9e6c8ddcb");
		
		Statement stmt = con.createStatement();
		
//		String tableSql = "CREATE TABLE IF NOT EXISTS employees(emp_id int PRIMARY KEY AUTO_INCREMENT, name varchar(30), position varchar(30), salary double)";
//		
//		stmt.execute(tableSql);
//		
//		String insertSql = "INSERT INTO employees(name, position, salary) VALUES('john', 'developer', 200000)";
//		
//		stmt.executeUpdate(insertSql);
		
		String selectSql = "SELECT * FROM employees";
		
		ResultSet resultSet = stmt.executeQuery(selectSql);
		
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getString(4));
		}
		
		stmt.close();
	}
}
//Collapse




