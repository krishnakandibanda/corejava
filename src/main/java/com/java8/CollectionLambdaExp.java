package com.java8;

import java.util.ArrayList;
import java.util.List;

public class CollectionLambdaExp {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(5);
		list.add(10);
		list.add(20);
		System.out.println("---old way of iterating-for loop --");
		for (int i = 0; i < args.length; i++) {
			System.out.print("  " + list.get(i));
		}

		System.out.println("---old way of iterating-for each --");
		// old way of iterating
		for (Integer element : list) {
			System.out.print(" " + element);
		}

		System.out.println("\n---New way of iterating--Lambda --");
		list.forEach(el -> {
			System.out.print(" " + el);
		});

	}
}
