package com.collections.sort;

import java.util.Comparator;

public class EmployeesSortById implements Comparator<Employees> {

	/*
	 * private int empId;
	 * 
	 * @Override public int compareTo(Employees otherEmployee) { int id =
	 * otherEmployee.empId; // same type object if (this.empId > id) return 1; else
	 * if (this.empId < id) return -1; else return 0; }
	 */

	@Override
	public int compare(Employees emp1, Employees emp2) {
		int value = 0;
		if (emp1.empId > emp2.empId)
			value = 1;
		else if (emp1.empId < emp2.empId)
			value = -1;
		else if (emp1.empId == emp2.empId)
			value = 0;
		return value;
	}
}
