package com.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeesComparatorSort {

	public static void main(String[] args) {

		List<Employees> employees = new ArrayList<Employees>();

		employees.add(new Employees(5, "E", 18));
		employees.add(new Employees(9, "D", 19));
		employees.add(new Employees(3, "A", 14));
		employees.add(new Employees(2, "C", 22));

		System.out.println("----Sort By Employee Id -- Comparator---");
		// Collections.sort(employees);
		Collections.sort(employees, new EmployeesSortById());
		printEmployees(employees);

		System.out.println("\n----Sort By Employee Name -- Comparator--");
		Collections.sort(employees, new EmployeeSortByName());
		printEmployees(employees);

		System.out.println("\n----Sort By Employee Age -- Comparator--");
		Collections.sort(employees, new EmployeesSortByAge());
		printEmployees(employees);

	}

	// print employee
	public static void printEmployees(List<Employees> employees) {
		for (Employees e : employees) {
			System.out.println("Id->" + e.empId + " Name -> " + e.empName + " Age -> " + e.empAge);
		}
	}

}