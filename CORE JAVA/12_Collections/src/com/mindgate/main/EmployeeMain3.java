package com.mindgate.main;

import java.util.Arrays;

import com.mindgate.domain.Employee;

public class EmployeeMain3 {

	public static void main(String[] args) {

		int[] numbers = { 9, 32, 11, 76, 33 };

		Arrays.sort(numbers);
		System.out.println("After sorting");
		for (int i : numbers) {
			System.out.println(i);
		}

		System.out.println("-----------------------");

		Employee employee1 = new Employee(101, "Srini", 1000);
		Employee employee2 = new Employee(102, "Vijay", 2000);
		Employee employee3 = new Employee(103, "Aswin", 3000);

		Employee[] employees = new Employee[3];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		
		Arrays.sort(employees);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
