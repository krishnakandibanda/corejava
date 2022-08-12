package com.interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CreateObjectWays {
	public static void main(String[] args) {
//Java Object Serialization and Deserialization
		Demo object = new Demo(8, "javatpoint");
		// System.out.println(object.toString().getClass());
		String filename = "C:\\Users\\Krishna\\OneDrive\\Desktop\\Demo.txt";
		// specified file name (must have extension.ser)
		/*-----------------Serialization----------*/
		try {
			FileOutputStream file = new FileOutputStream(filename); // Saving of object in the file
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object); // serialize object
			out.close(); // closes the ObjectOutputStream
			file.close(); // closes the file
			System.out.println("Object serialized");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Demo obj = null;
		/*-----------------Deserialization--------*/
		try {
			FileInputStream file = new FileInputStream(filename); // reading an object from a file
			ObjectInputStream is = new ObjectInputStream(file);
			object = (Demo) is.readObject(); // deserialize object
			is.close(); // closes the ObjectInputStream
			file.close(); // closes the file
			System.out.println("Object deserialized ");
			System.out.println("number = " + object.i);
			System.out.println("string = " + object.s);
		} catch (IOException e) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
}

class Demo implements Serializable {
	public int i;
	public String s;

	public Demo(int i, String s) // default constructor
	{
		this.i = i;
		this.s = s;
	}
}

//Java Object.clone() method
class CloneExample implements Cloneable {
	// creates and returns a copy of this object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	String name = "Microprocessor";

	public static void main(String[] args) {
		CloneExample obj1 = new CloneExample(); // creating object of class
		try {
			CloneExample obj2 = (CloneExample) obj1.clone();
			System.out.println(obj1.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
