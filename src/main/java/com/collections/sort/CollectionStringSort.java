package com.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
There are 7 ways you can iterate through List.
1)Simple For loop
2)Enhanced For loop
3)Iterator
4)ListIterator
5)While loop
6)Iterable.forEach() util
7)Stream.forEach() util
 */

public class CollectionStringSort {

	public static void main(String[] args) {

		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("Australia");
		countries.add("Canada");
		countries.add("Singapore");
		countries.add("US");
		System.out.println("List of Countries Before Sorting");

		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			System.out.println("While.." + it.next());
		}
		Collections.sort(countries);
		it = countries.iterator();
		System.out.println("List of Countries After Sorting ");
		while (it.hasNext()) {
			System.out.println("..." + it.next());
		}
	}
}
