package com.java8;

@FunctionalInterface
interface Interf {
	public int square(int n);
}

public class SquareLambda {
	public static void main(String[] args) {
		// Lambda call
		Interf i = n -> n * n;
		System.out.println("square of 5 --- " + i.square(5));
		System.out.println("square of 9 --- " + i.square(9));
		System.out.println("square of 10 --- " + i.square(10));
	}
}
