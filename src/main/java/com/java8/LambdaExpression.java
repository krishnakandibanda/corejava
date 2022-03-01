package com.java8;

/*
	(arg1,arg2,arg3,…)  -> {body of implementing method};
	(int x, int y,int z) -> { return x + y + z; };
	() -> System.out.println("no arg method");
	String s) -> { System.out.println(s); };
	() -> 10
	() -> { return 3.14 };
  
 */

public class LambdaExpression {
	public static void main(String[] args) {

		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("--Old way of calling run method--");
			}
		};
		r.run();

		Runnable ru = () -> System.out.println("-----New Way of calling run method using Lambda--");
		ru.run();

		new Thread(() -> System.out.println("Thread Class run method using Lambda------")).start();

	}
}
