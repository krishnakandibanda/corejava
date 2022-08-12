package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestListOfEmployeeSorting {
	public static void main(String[] args) {
		List<Employee> emp = getEmployees();
		System.out.println("--Before -- Sort--");
		emp.forEach(s -> System.out.println(s));

		// sort by Id
		Collections.sort(emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpId() - e2.getEmpId();
			}
		});
		System.out.println("--After -- Sort-BY---ID--");
		emp.forEach(System.out::println);

		// sort by name
		Collections.sort(emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpName().compareTo(e2.getEmpName());
			}
		});
		System.out.println("--After -- Sort-By---Name--");
		emp.forEach(l -> System.out.println(l));

		// sort by salary
		Collections.sort(emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEmpSaraly().compareTo(e2.getEmpSaraly());
			}
		});
		System.out.println("--After -- Sort-By---Salary--");
		emp.forEach(s -> System.out.println(s));
		System.out.println("-----------------Use BY Lambda--------------------------------------");
		System.out.println("After--Sort--Lambda--By--Id--");
		// Lambda here
		emp.sort((Employee e1, Employee e2) -> e1.getEmpId() - e2.getEmpId());
		emp.forEach(System.out::println);

		System.out.println("After--Sort--Lambda--By--Grade--");
		// lambda, valid, parameter type is optional
		emp.sort((o1, o2) -> o1.getEmpGrade() - o2.getEmpGrade());
		emp.forEach(s -> System.out.println(s));

		System.out.println("After--Sort--Lambda--By--FatherName--");
		// lambda
		emp.sort((Employee o1, Employee o2) -> o1.getEmpName().compareTo(o2.getEmpName()));
		emp.sort((o1, o2) -> o1.getEmpFName().compareTo(o2.getEmpFName()));
		emp.forEach(k -> System.out.println(k));

		System.out.println("After--Sort--Lambda--By--Saraly---");
		// lambda
		emp.sort((Employee o1, Employee o2) -> o1.getEmpSaraly().compareTo(o2.getEmpSaraly()));
		emp.sort((o1, o2) -> o1.getEmpSaraly().compareTo(o2.getEmpSaraly()));
		emp.forEach(j -> System.out.println(j));

		System.out.println("--------After--Sort--Lambda--By--Saraly---");
		Comparator<Employee> salaryComparator = (o1, o2) -> o1.getEmpSaraly().compareTo(o2.getEmpSaraly());
		emp.sort(salaryComparator);
		emp.forEach(System.out::println);

		System.out.println("--------After--Sort--Lambda--By--Saraly---Reversed---");
		Comparator<Employee> salaryComparator1 = (o1, o2) -> o1.getEmpSaraly().compareTo(o2.getEmpSaraly());
		emp.sort(salaryComparator1.reversed());
		emp.forEach(s -> System.out.println(s));

		System.out.println("Getting employee details--Stream--greather than > 250000");

		List<Employee> employees = getEmployees();
		List<Employee> employeesGreaterSalary = employees.stream().filter(emp2 -> emp2.getEmpSaraly() > 250000)
				.collect(Collectors.toList());
		// System.out.println(employeesGreaterSalary);
		employeesGreaterSalary.forEach(System.out::println);

		System.out.println("Getting employee..Stream...details < 350000");

		List<Employee> empsala = getEmployees();
		List<Employee> sala = empsala.stream().filter(emp3 -> emp3.getEmpSaraly() < 350000)
				.collect(Collectors.toList());
		sala.forEach(e -> System.out.println(e));

		System.out.println("Getting employee..Stream...Grade ---A---");
		List<Employee> empGrade = getEmployees();
		// List<Employee> grade = empGrade.stream().filter(emp4 -> 'A' ==
		// emp4.getEmpGrade()).collect(Collectors.toList());
		List<Employee> grade = empGrade.stream().filter(emp4 -> "C".equals(emp4.getEmpGrade().toString()))
				.collect(Collectors.toList());
		grade.forEach(System.out::println);

	}

	public static List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(103, "Lishna", "Mopaiah", 'B', 250000.0));
		list.add(new Employee(101, "Krish", "Gopaiah", 'A', 500000.0));
		list.add(new Employee(102, "Vishna", "Sopaiah", 'D', 300000.0));
		list.add(new Employee(106, "Sishna", "Vopaiah", 'C', 200000.0));
		list.add(new Employee(104, "Nishna", "Lopaiah", 'E', 400000.0));
		list.add(new Employee(105, "Mishna", "Nopaiah", 'A', 450000.0));
		list.add(new Employee(107, "Sishna", "Vopaiah", 'C', 250000.0));
		return list;
	}
}
