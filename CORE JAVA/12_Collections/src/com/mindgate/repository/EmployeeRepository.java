package com.mindgate.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mindgate.domain.Employee;

public class EmployeeRepository implements EmployeeRepositoryInterface {

	private Set<Employee> employeeSet = new HashSet<>();

	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeSet.add(employee);

		// boolean result=employeeList.add(employee);
		// return result;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {

		for (Employee employee : employeeSet) {
			if (employeeId == employee.getEmployeeId()) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public Set<Employee> getAllEmployee() {
		return employeeSet;
	}

	@Override
	public Employee updateEmployeeSalary(int employeeId, double newSalary) {

		for (Employee employee : employeeSet) {
			if (employeeId == employee.getEmployeeId()) {
				employee.setSalary(newSalary);
				return employee;
			}
		}

		return null;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {

		for (Employee employee : employeeSet) {
			if (employeeId == employee.getEmployeeId()) {
				return employeeSet.remove(employee);
			}
		}
		return false;
	}

}
