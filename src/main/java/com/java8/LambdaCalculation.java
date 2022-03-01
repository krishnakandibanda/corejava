package com.java8;

@FunctionalInterface
interface Calculation {
	public int process(int a, int b);

	public static void sub(int a, int b) {
		System.out.println("subtraction === " + (a - b));
	}

	public default int mul(int a, int b) {
		// System.out.println(" Multiplication == " + (a * b));
		return a * b;
	}

	public default int div(int a, int b) {
		return a / b;
	}
}

public class LambdaCalculation {
	public static void main(String[] args) {
		int a = 10, b = 5;
		// without lambda, Calculation implementation using anonymous class

		/*
		 * Calculation cal = new Calculation() { int c;
		 * 
		 * @Override public void add() { System.out.println("Add Two Add " + (c = a +
		 * b)); }
		 * 
		 * public void sub() { System.out.println("Add Two Sub " + (c = a - b)); }
		 * 
		 * @Override public void mul() { System.out.println("Add Two mul " + (c = a *
		 * b)); }
		 * 
		 * @Override public void div() { System.out.println("Add Two Div " + (c = a /
		 * b));
		 * 
		 * } }; cal.add(); Calculation.sub(); cal.mul(); cal.div();
		 */

		// Lambda
		Calculation add = (c, d) -> {
			return (c + d);
		};

		Calculation mul = (c, d) -> {
			return (c * d);
		};

		Calculation div = (c, d) -> {
			return (c / d);
		};

		add.process(30, 30);
		mul.process(30, 30);
		div.process(30, 30);
		Calculation.sub(30, 20);
		// System.out.println(div.mul(10, 2));
		// System.out.println(div.div(20, 60));
		Calculation.sub(30, 20);
		mul.process(30, 30);
		addAnother(mul);
	}

	public static void addAnother(Calculation cal) {
		int c = 20;
		int d = c + cal.process(50, 20);
		System.out.println("Final value = " + d);
	}

}
