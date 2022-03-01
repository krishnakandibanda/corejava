package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestListToMap {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Keishna", "Gopaiah", 'A', 500000.0));
		list.add(new Employee(102, "Vishna", "Sopaiah", 'C', 300000.0));
		list.add(new Employee(103, "Lishna", "Mopaiah", 'B', 300000.0));
		list.add(new Employee(104, "Nishna", "Lopaiah", 'B', 400000.0));
		list.add(new Employee(105, "Mishna", "Nopaiah", 'A', 500000.0));
		list.add(new Employee(106, "Sishna", "Vopaiah", 'C', 200000.0));
		list.add(new Employee(107, "Sishna", "Vopaiah", 'C', 200000.0));

		// list.forEach(sub -> System.out.println(sub));
		 list.forEach(System.out::println);

		// Key = id, value =name
		Map<Integer, String> idname = list.stream()
				.collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpFName));
		System.out.println("List to Map Id-Name " + idname);

		// Same with result1, just different syntax

		Map<Integer, String> diway = list.stream().collect(Collectors.toMap(x -> x.getEmpId(), x -> x.getEmpFName()));
		 System.out.println("..." + diway);

		Map<Character, Double> neway = list.stream().collect(
				Collectors.toMap(Employee::getEmpGrade, Employee::getEmpSaraly, (oldValue, newValue) -> oldValue));
		System.out.println("-----" + neway);

		Map result1 = list.stream().sorted(Comparator.comparingDouble(Employee::getEmpSaraly).reversed())
				.collect(Collectors.toMap(Employee::getEmpGrade, Employee::getEmpSaraly, // key = name, value = websites
						(oldValue, newValue) -> newValue, // if same key, take the old key
						LinkedHashMap::new // returns a LinkedHashMap, keep order
				));

		System.out.println("Result 1 : " + result1);

	}
}
