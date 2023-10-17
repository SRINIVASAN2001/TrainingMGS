package com.mindgate.main;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.mindgate.domain.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		Employee employee = new Employee();

		Scanner scanner = new Scanner(System.in);
		String status;

		do {
			System.out.println("-->EMPLOYEE DATABASE MANAGEMENT<--");
			System.out.println("--> 1.Add Employee");
			System.out.println("--> 2.Read One Employee");
			System.out.println("--> 3.Read All Employee");
			System.out.println("--> 4.Update Salary");
			System.out.println("--> 5.Remove Employee");

			System.out.println("Choose Your choice!!!");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the ID: ");
				int employeeId = scanner.nextInt();
				System.out.println("Enter the Name: ");
				String name = scanner.next();
				System.out.println("Enter the Salary: ");
				double salary = scanner.nextDouble();

				employee = new Employee(employeeId, name, salary);
				employeeServiceInterface.addNewEmployee(employee);
				System.out.println("New Employee is added successfully!!");
				break;

			case 2:
				System.out.println("Enter the ID: ");
				employeeId = scanner.nextInt();

				employee = employeeServiceInterface.getEmployeeByEmployeeId(employeeId);
				System.out.println("Your Result is generated!!!");
				System.out.println(employee);
				break;

			case 3:

				Set<Employee> employee1 = employeeServiceInterface.getAllEmployee();
				System.out.println(employee1);
				System.out.println("Your Result is generated!!!");
				break;
			case 4:

				System.out.println("Enter the ID: ");
				employeeId = scanner.nextInt();
				System.out.println("Enter the Salary: ");
				salary = scanner.nextDouble();

				employee = employeeServiceInterface.updateEmployeeSalary(employeeId, salary);
				System.out.println(employee);

				System.out.println("Your Result is generated!!!");
				break;
			case 5:

				System.out.println("Enter the ID: ");
				employeeId = scanner.nextInt();
				employeeServiceInterface.deleteEmployeeByEmployeeId(employeeId);
				System.out.println("Your Result is generated!!!");
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

			System.out.println("Do you want to continue? Yes or No");
			status = scanner.next();

		} while (status.equalsIgnoreCase("Yes"));
		scanner.close();
		System.out.println("Thank you Mate :)");

	}

}
