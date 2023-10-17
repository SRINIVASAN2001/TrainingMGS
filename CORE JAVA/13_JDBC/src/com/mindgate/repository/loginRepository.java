package com.mindgate.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mindgate.domain.LoginDetails;

public class loginRepository implements loginRepositoryInterface {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String user = "scott";
	private String password = "tiger";
	private String driver = "oracle.jdbc.driver.OracleDriver";

	private String validateLoginSql = "select * from login_details where login_id=?";
	private String loginCountSql = "update login_details set login_count=? where login_id=?";


	@Override
	public String validateLoginDetails(String loginId, String password) {

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, this.password);
			preparedStatement = connection.prepareStatement(validateLoginSql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, password);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String returnName = resultSet.getString(3);
				String returnPassword=resultSet.getString(2);
				return returnName;
			} else {
				preparedStatement = connection.prepareStatement(loginCountSql);
				preparedStatement.setInt(1, );
				preparedStatement.setString(2, loginId);
				preparedStatement.executeUpdate();
				
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver is failed to load!!");
			e.getMessage();
		} catch (SQLException e) {

			System.out.println("Check your query!!");
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public int checkLoginCount() {

		return count;
	}

}
