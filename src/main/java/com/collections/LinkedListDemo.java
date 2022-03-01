package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("A");
		list.add("C");
		list.addFirst("K");
		list.addLast("B");
		list.add(2, "S");

		System.out.println(list);

		list.remove("K");
		System.out.println(list);

		list.remove("a");
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

	}
}
