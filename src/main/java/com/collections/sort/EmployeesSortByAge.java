package com.collections.sort;

import java.util.Comparator;

public class EmployeesSortByAge implements Comparator<Employees> {

	@Override
	public int compare(Employees emp1, Employees emp2) {
		int result = 0;
		if (emp1.empAge > emp2.empAge)
			result = 1;
		else if (emp1.empAge < emp2.empAge)
			result = -1;
		else if (emp1.empAge == emp2.empAge)
			result = 0;
		return result;

		// return emp1.getEmpAge() - emp2.getEmpAge();
	}

	/*
	 * @Override public int compare(Employees emp1, Employees emp2) { int value = 0;
	 * if (emp1.empId > emp2.empId) value = 1; else if (emp1.empId < emp2.empId)
	 * value = -1; else if (emp1.empId == emp2.empId) value = 0; return value; }
	 */
}
