package com.method;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter Two Value ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		subtraction(x, y);
		int z = multiplication(x, y);
		System.out.println(" Multiplication -- Static Method --- Static Return   " + z);

		Calculation cal = new Calculation();
		cal.addtion(x, y);
		int di = cal.division(x, y);
		System.out.println(" Division -- Instance Method--Only Return No Static  " + di);

	}

	public void addtion(int x, int y) {
		int z = x + y;
		System.out.println(" Addtion  --    With out return AnyThing (void)   " + z);
	}

	// (x,y)->x+y;

	public static void subtraction(int x, int y) {
		int sub = x - y;
		System.out.println(" Subtraction  -- With out return but Static()    " + sub);
	}

	public static int multiplication(int x, int y) {
		int mul = x * y;
		return mul;
	}

	public int division(int x, int y) {
		int div = x / y;
		return div;
	}

}
