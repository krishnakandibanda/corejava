package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestDemo {
	public static void main(String[] args) {

		System.out.println("---Even Numbers--");
		evenNumber();
		System.out.println("---Starting Numbers with one - 1 --");
		startingWithOne();
		System.out.println("---Duplicate Elements --");
		duplicateElements();
		System.out.println("---Total Elements --");
		totalElements();
	}

	public static void evenNumber() {
		List<Integer> myList = Arrays.asList(10, 5, 18, 42, 7, 9, 33);
		myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

	public static void startingWithOne() {
		// Convert integer to String
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
	}

	public static void duplicateElements() {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet();
		myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		myList.stream().findFirst().ifPresent(System.out::println);
	}

	public static void totalElements() {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		long count = myList.stream().count();
		System.out.println(count);
	}

}
