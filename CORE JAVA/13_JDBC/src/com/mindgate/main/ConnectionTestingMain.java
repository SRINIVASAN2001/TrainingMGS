package com.mindgate.main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestingMain {

	public static void main(String[] args) {

		System.out.println("Main Start");

		try {
			System.out.println("Step 1.Loading Drivers");
			Class.forName("oracle.jdbc.driver.OracleDriver");

			System.out.println("Step.2 Connect Database Server");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "scott",
					"tiger");

			if (connection != null) {
				System.out.println("Connected Successfully!!");
				connection.close();
				System.out.println("Connection Closed Successfully!!");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load Driver Class");
		} catch (SQLException e) {
			System.out.println("Connection Failed!!");
		}

		System.out.println("Main End");
	}

}
