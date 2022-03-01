package com.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparableSort {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "D", 18000));
		employees.add(new Employee(16, "B", 19000));
		employees.add(new Employee(13, "M", 14000));
		employees.add(new Employee(19, "A", 22000));

		System.out.println("----Sort By Employee ID----");
		Collections.sort(employees);
		printEmployees(employees);
	}

	// print employee
	public static void printEmployees(List<Employee> employees) {
		for (Employee e : employees) {
			System.out.println("Id->" + e.emplId + " Name -> " + e.emplName + " Salary -> " + e.emplSalary);
		}
	}

}
