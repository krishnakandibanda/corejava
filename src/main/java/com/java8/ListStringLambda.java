package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ListStringLambda {
	public static void main(String[] args) {

		ListStringLambda le = new ListStringLambda();
		List<Employee> list = le.createEmployess();

		list.forEach(sub -> System.out.println(sub));

	}

	public List<Employee> createEmployess() {
		List<Employee> result = new ArrayList<Employee>();
		result.add(createEmployee(101, "Keishna", "Gopaiah", 'A', 500000.0));
		result.add(createEmployee(102, "Vishna", "Sopaiah", 'C', 300000.0));
		result.add(createEmployee(103, "Lishna", "Mopaiah", 'B', 300000.0));
		result.add(createEmployee(104, "Nishna", "Lopaiah", 'B', 400000.0));
		result.add(createEmployee(105, "Mishna", "Nopaiah", 'A', 500000.0));
		result.add(createEmployee(106, "Sishna", "Vopaiah", 'C', 200000.0));
		return result;
	}

	private Employee createEmployee(Integer i, String string, String string2, Character c, double d) {
		Employee e = new Employee();
		e.setEmpId(i);
		e.setEmpName(string);
		e.setEmpFName(string2);
		e.setEmpGrade(c);
		e.setEmpSaraly(d);
		return e;
	}

}
