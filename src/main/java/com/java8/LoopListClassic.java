package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoopListClassic {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("D");
		list.add("A");
		list.add("B");
		list.add(null);
		list.add("E");
		list.add("F");
		list.add("G");

		for (int i = 0; i < list.size(); i++) {
			System.out.println("Just For " + list.get(i));
		}

		for (String s : list) {
			System.out.print("--" + s);
		}

		// lambda
		list.forEach(x -> System.out.println(" " + x));

		// method reference
		list.forEach(System.out::print);

		// filter null value
		list.stream().filter(Objects::nonNull).forEach(System.out::println);

	}
}
