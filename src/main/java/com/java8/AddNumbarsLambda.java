package com.java8;

interface AddNumbers {
	void abstract_arith(int x, int y);

	default void default_fun() {
		System.out.println("This is Default method");
	}
}

public class AddNumbarsLambda {

	public static void main(String[] args) {

		AddNumbers fobj = (int a, int b) -> System.out.println("sum of  ==  " + (a - b));
		fobj.default_fun();
		fobj.abstract_arith(10, 18);

	}
}
