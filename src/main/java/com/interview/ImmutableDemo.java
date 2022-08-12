package com.interview;

final class Employee {

	private String pancardNumber;

	public Employee(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}

public class ImmutableDemo {
	public static void main(String[] args) {

		Employee e = new Employee("ABC1234");
		Employee e1 = new Employee("ADVC1234");

		String str = e.getPancardNumber();
		String str1 = e1.getPancardNumber();

		System.out.println("PANCard Number : " + str);
		System.out.println("PANCard Number : " + str1);

	}
}
