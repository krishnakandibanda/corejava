package com.interview;

public class TestDemo {

	public static void main(String args[]) {
		// 0 1 1 2 3 5 8 13 21..
		System.out.println("FaonacciNumbers--");
		fibonacciNumbers();
		System.out.println("Swap Two only Two Numbers---");
		swapTwoNumbers();

	}

	public static void fibonacciNumbers() {
		int f1 = 0, f2 = 1, f3;
		// int f1,f2,f3;
		int n = 10;
		System.out.print(f1 + "," + f2);
		for (int i = 2; i <= n; ++i) {
			f3 = f1 + f2;
			System.out.print("," + f3);
			f1 = f2;
			f2 = f3;
		}
	}

	public static void swapTwoNumbers() {
		int a = 10, b = 20;
		System.out.println(a + " --before swap-- " + b);
		a = a + b; // 30
		b = a - b; // b =30-20 =10
		a = a - b; // a =30-10 =20
		System.out.println(a + "--After swap-- " + b);
	}

}