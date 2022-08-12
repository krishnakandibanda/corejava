package com.constructor;

//Create and call a class constructor of MyClass

//Create a CallConstructor class
public class CallConstructor {
	// Create a class attribute x
	int x;

	// Create a class constructor for the CallConstructor class
	public CallConstructor() {
		// Set the initial value for the class attribute x to 5
		x = 5;
	}

	public static void main(String[] args) {
		// Create an callObj object of class CallConstructor (This will call the
		// constructor)
		CallConstructor callObj = new CallConstructor();
		// Print the value of x
		System.out.println("--X-value--" + callObj.x);

	}
}
