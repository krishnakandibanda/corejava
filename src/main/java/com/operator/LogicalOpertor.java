package com.operator;

public class LogicalOpertor {
	public static void main(String[] args) {

		int value1 = 2;
		int value2 = 5;

		if ((value1 == 2) && (value2 == 5)) {
			System.out.println("value1 = 2 AND value2 = 5");
		}
		if ((value1 == 2) || (value2 == 1)) {
			System.out.println("value1  = 2  OR  value2 = 5 ");
		}
	}
}
