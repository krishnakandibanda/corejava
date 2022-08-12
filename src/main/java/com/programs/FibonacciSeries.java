package com.programs;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("--FibonacciSeries--");
		fibonaSeries();
		System.out.println("\n--Swap Two Numbers--");
		swapTwo();
	}

	public static void fibonaSeries() {
		int f1 = 0, f2 = 1, f3, n = 10;
		System.out.print(f1 + "," + f2);
		for (int i = 0; i <= n; i++) {
			f3 = f1 + f2;
			System.out.print("," + f3);
			f1 = f2;
			f2 = f3;
		}
	}

	public static void swapTwo() {
		int a = 10, b = 20;
		System.out.println(a + "--Before Swap--" + b);
		a = a + b;// a = 10+20 =30
		b = a - b;// b = 30-20 =10
		a = a - b;// a = 30-10 =20
		System.out.println(a + "--After Swap--" + b);
	}

}
