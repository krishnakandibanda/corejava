package com.java8;

//After Lambda 
@FunctionalInterface
interface OperationsAll {
	// public int sum(int a, int b);

	public void add();

	public static int sub(int a, int b) {
		System.out.println("-----Subtraction-static-int-sub()--" + (a - b));
		return a - b;
	}

	public static void subtr(int a, int b) {
		System.out.println("----------Subtraction-static-void-sub()--" + (a - b));
	}

	public default int mul(int a, int b) {
		System.out.println("---Multiplication-default-int-mul()--" + (a * b));
		return a * b;
	}

	public default void div(int a, int b) {
		System.out.println("---Division-default-void-div()--" + (a / b));
	}
}

class Check implements OperationsAll {

	@Override
	public void add() {
		int i = 30, j = 30;
		System.out.println("-CheckClass-Interface-void-add()--" + (i + j));
	}
}

public class ArithmeticOperators {
	public static void main(String[] args) {
		Check ch = new Check();
		ch.add();

		int a = 30, b = 10;

		OperationsAll ao = () -> {
		};

		int d = ao.mul(a, b);
		System.out.println("Return default-mul()---" + d);

		ao.div(a, b);
		OperationsAll.subtr(a, b);

		int c = OperationsAll.sub(a, b);
		System.out.println("Return static sub()----" + c);

	}

	public static void test() {
		// Lambda
		Calculation add = (c, d) -> {
			return (c + d);
		};
	}
}