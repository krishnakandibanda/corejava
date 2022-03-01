package com.collections.sort;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employees> {

	@Override
	public int compare(Employees emp1, Employees emp2) {
		return emp1.empName.compareTo(emp2.empName);
	}

}
