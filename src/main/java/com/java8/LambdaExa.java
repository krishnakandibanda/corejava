package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExa {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("node", "java", "python", "ruby");
		list.forEach(new Consumer<String>() { // anonymous class
			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		});

		List<String> listlam = Arrays.asList("node", "java", "python", "ruby");
		list.forEach(str -> System.out.print(" " + str)); // lambda expressions

		List<String> listlambda = Arrays.asList("node", "java", "python", "ruby");
		list.forEach(System.out::println); // method references

	}
}
