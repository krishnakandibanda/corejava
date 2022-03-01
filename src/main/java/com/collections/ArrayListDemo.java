package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>(5);

		for (int i = 1; i <= 5; i++) {
			arrayList.add(i);
		}

		System.out.println(arrayList);

		arrayList.remove(2);

		System.out.println(arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}

		System.out.println("_________________________");
		for (int i : arrayList) {
			System.out.print(i + " ");
		}
	}
}
