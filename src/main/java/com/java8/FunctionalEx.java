package com.java8;

@FunctionalInterface
interface FuInterf {
	void show();
}

public class FunctionalEx implements FuInterf {
	public static void main(String[] args) {
		FunctionalEx is = new FunctionalEx();
		is.show();
	}

	@Override
	public void show() {
		System.out.println("--Old way call interface--show()--");
	}
}

class FunctionalExLambda {
	public static void main(String[] args) {
		FuInterf ex2 = () -> System.out.println("---Lambda way call-show()---");
		ex2.show();
	}
}
