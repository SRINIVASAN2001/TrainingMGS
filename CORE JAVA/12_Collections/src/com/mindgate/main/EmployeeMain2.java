package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.domain.Employee;

public class EmployeeMain2 {

	public static void main(String[] args) {

		Employee employee1 = new Employee(101, "Srini", 1000);
		Employee employee2 = new Employee(101, "Srini", 1000);
		Employee employee3 = new Employee(102, "Srini", 1000);

		System.out.println(employee1);
		System.out.println(employee1.hashCode());

		System.out.println(employee2);
		System.out.println(employee2.hashCode());

		System.out.println(employee3);
		System.out.println(employee3.hashCode());

		System.out.println("----------------------------------------");

		Set<Employee> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		System.out.println(employees);
	}

}
