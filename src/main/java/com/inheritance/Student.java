package com.inheritance;

class Person {
	String name = "Srini";
	int age = 20;
	String city = "Hyd";

	public void show() {
		System.out.println("----This is Person Class----");
	}
}

public class Student extends Person {
	String name = "Krishna";
	String str = "kodad";
	int num = 10;

	public static void main(String[] args) {
		Person pe = new Person();
		Student stu = new Student();
		stu.show();
		System.out.println("-----" + stu.name);
		System.out.println("-----" + pe.name);
		System.out.println("-----" + stu.age);
		System.out.println("-----" + stu.city);
		System.out.println("-----" + stu.str);
		System.out.println("-----" + stu.num);

	}
}
