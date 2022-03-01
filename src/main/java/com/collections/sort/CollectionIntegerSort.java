package com.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionIntegerSort {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(15);
		numbers.add(18);
		numbers.add(4);
		numbers.add(3);
		numbers.add(9);
		numbers.add(12);
		numbers.add(1);

		System.out.println("Ascending Order Sorting -using sort()-");

		Collections.sort(numbers);
		for (Integer integer : numbers) {
			System.out.println(integer);
		}

		System.out.println("Descending Order Sorting -using reverse()-");

		Collections.reverse(numbers);
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}

}
