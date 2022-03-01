package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonUser {
	public static void main(String[] args) {

		Person p1 = new Person("Krish", 1, 20000.0);
		Person p2 = new Person("Veda", 2, 50000.0);
		Person p3 = new Person("Nandhu", 3, 30000.0);
		Person p4 = new Person("Pandu", 4, 25000.0);

		List<Person> li = new ArrayList<Person>();
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		/*
		 * for (Person person : li) { System.out.println(person); }
		 */
		System.out.println("---People before sortng---\n");
		li.forEach(cl -> {
			System.out.println(cl);
		});
		// System.out.print(li);

		/*
		 * Collections.sort(li, new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person p1, Person p2) { return
		 * p1.getName().compareTo(p2.getName()); } });
		 */

		/*
		 * li.forEach(pl -> { System.out.println(pl); });
		 */
		Collections.sort(li, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				int value = 0;
				if (o1.getId() > o2.getId())
					value = 1;
				else if (o1.getId() < o2.getId())
					value = -1;
				else if (o1.getId() == o2.getId())
					value = 0;
				return value;
			}
		});

		System.out.println("\n--Sorting By ID ---");
		li.forEach(le -> {
			System.out.println(le);
		});

		Collections.sort(li, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				int value = 0;
				if (o1.getSalary() > o2.getSalary())
					value = 1;
				else if (o1.getSalary() < o2.getSalary())
					value = -1;
				else if (o1.getSalary() == o2.getSalary())
					value = 0;
				return value;
			}
		});

		System.out.println("\n---Sorting By salary---");
		li.forEach(sl -> {
			System.out.println(sl);
		});

		// Using Lambda Expression
		Collections.sort(li, (a, b) -> {
			return a.getName().compareTo(b.getName());
		});
		System.out.println("\n--People After Sorting by name--");
		li.forEach(lss -> {
			System.out.println(lss);
		});

	}
}
