package com.collections;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(5, "Krish");
		treeMap.put(3, "Vedashu");
		treeMap.put(5, "Nani");
		treeMap.put(4, "Cheru");
		treeMap.put(2, "Cheru");
		System.out.println(treeMap);

	}

}
