package com.mindgate.service;

import java.util.List;
import java.util.Set;

import com.mindgate.domain.Employee;

public interface EmployeeServiceInterface {

	boolean addNewEmployee(Employee employee);

	Employee getEmployeeByEmployeeId(int employeeId);

	Set<Employee> getAllEmployee();

	Employee updateEmployeeSalary(int employeeId, double newSalary);

	boolean deleteEmployeeByEmployeeId(int employeeId);

}
