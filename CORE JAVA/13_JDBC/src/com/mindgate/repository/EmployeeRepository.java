package com.mindgate.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mindgate.domain.Employee;

public class EmployeeRepository implements EmployeeRepositoryInterface {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String user = "scott";
	private String password = "tiger";
	private String driver = "oracle.jdbc.driver.OracleDriver";

	private String insertEmployeeSql = "insert into employee_details values(?,?,?)";
	private String selectAllEmployeeSql = "select * from employee_details";
	private String selectOneEmployeeSql = "select * from employee_details where employee_id=?";
	private String updateEmployeeSalarySql = "update employee_details set salary=? where employee_id=?";
	private String deleteEmployeeSql = "delete from employee_details where employee_id=?";

	@Override
	public boolean addNewEmployee(Employee employee) {

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			preparedStatement = connection.prepareStatement(insertEmployeeSql);
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());

			int rowCount = preparedStatement.executeUpdate();

			if (rowCount > 0) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load the driver!!");
			e.getMessage();
		} catch (SQLException e) {
			System.out.println("Connection is failed");
			e.getMessage();
		} finally {
			try {
				connection.close();
				System.out.println("Connection is closed!!!");
			} catch (SQLException e) {
				e.getMessage();
			}
		}
		return false;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			preparedStatement = connection.prepareStatement(selectOneEmployeeSql);
			preparedStatement.setInt(1, employeeId);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				int Id = resultSet.getInt("employee_id");
				String name = resultSet.getString("name");
				Double salary = resultSet.getDouble("salary");

				Employee employee = new Employee(Id, name, salary);
				return employee;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load the driver!!");
			e.getMessage();
		} catch (SQLException e) {
			System.out.println("Connection is failed");
			e.getMessage();
		} finally {
			try {
				connection.close();
				System.out.println("Connection is closed!!");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			preparedStatement = connection.prepareStatement(selectAllEmployeeSql);
			resultSet = preparedStatement.executeQuery();

			List<Employee> employeeList = new ArrayList<>();
			while (resultSet.next()) {
				// System.out.println("EmployeeId-->" + resultSet.getInt(1) + "
				// " + "EmployeeName--> "
				// + resultSet.getString(2) + " " + "Salary-->" +
				// resultSet.getDouble(3));

				int employeeId = resultSet.getInt("employee_id");
				String name = resultSet.getString("name");
				Double salary = resultSet.getDouble("salary");

				Employee employee = new Employee(employeeId, name, salary);
				employeeList.add(employee);
			}
			return employeeList;
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load the driver!!");
			e.getMessage();
		} catch (SQLException e) {
			System.out.println("Connection is failed");
			e.getMessage();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Connection is closed!!");
		}
		return null;
	}

	@Override
	public Employee updateEmployeeSalary(int employeeId, double newSalary) {

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			preparedStatement = connection.prepareStatement(updateEmployeeSalarySql);
			preparedStatement.setDouble(1, newSalary);
			preparedStatement.setInt(2, employeeId);
			int rowCount = preparedStatement.executeUpdate();

			if (rowCount > 0) {
				Employee employee = getEmployeeByEmployeeId(employeeId);
				return employee;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load the driver!!");
			e.getMessage();
		} catch (SQLException e) {
			System.out.println("Connection is failed");
			e.getMessage();
		} finally {
			try {
				connection.close();
				System.out.println("Connection is closed!!");
			} catch (SQLException e) {
				System.out.println("Check your SQL Query!!!");
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			preparedStatement = connection.prepareStatement(deleteEmployeeSql);
			preparedStatement.setInt(1, employeeId);
			int rowCount = preparedStatement.executeUpdate();

			if (rowCount > 0) {
				System.out.println("Deleted Successfully!!!");
				return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load the driver!!");
			e.getMessage();
		} catch (SQLException e) {
			System.out.println("Connection is failed");
			e.getMessage();
		} finally {
			try {
				connection.close();
				System.out.println("Connection is closed!!");
			} catch (SQLException e) {
				System.out.println("Check your SQL Query!!!");
				System.out.println(e.getMessage());
			}
		}
		return false;
	}

}
