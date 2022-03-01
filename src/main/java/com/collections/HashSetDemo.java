package com.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSetDemo hd = new HashSetDemo();

		hd.hashSetDemo();

		Set<String> hashSet = new HashSet<>();

		hashSet.add("A");
		hashSet.add("B");
		boolean b1 = hashSet.add("C");
		System.out.println(b1);
		boolean b2 = hashSet.add("C");
		System.out.println(b2);
		hashSet.add("D");
		hashSet.add("E");

		System.out.println(hashSet);
		System.out.println("List Contains  C  or not ? " + hashSet.contains("C"));

		hashSet.remove("A");
		System.out.println("List after removing A :" + hashSet);

		for (String item : hashSet) {
			System.out.print(item + " ");
		}
		System.out.println("____________________________");

		for (int i = 1; i < hashSet.size(); i++) {
			System.out.print(hashSet);
		}
	}

	void hashSetDemo() {
		System.out.println("HashSetDemo - Method");

		Set<Integer> hashset = new HashSet<Integer>();

		hashset.add(1);
		hashset.add(5);
		hashset.add(4);
		hashset.add(3);
		hashset.add(2);
		hashset.add(4);
		System.out.print(hashset + " ");
	}
}
