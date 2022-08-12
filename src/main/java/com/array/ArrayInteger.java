package com.array;

public class ArrayInteger {

	/*
	 * declare an array --> int[] intarray or char chararray[]
	 * 
	 * create an array --> intarray = new int[10] or chararray = new char[8]
	 * 
	 * declare and create --> int[] intarray = new int[10]; or char cahrarray[] =new
	 * char[8];
	 * 
	 * initialize an array int[] intarray = new int[]{1, 2, 3}; or int[] intarray =
	 * {1, 2, 3};
	 * 
	 */

	public static void main(String[] args) {
		int[] intArray = new int[] { 5, 4, 3, 2, 1, 10 };
		System.out.println("Size of an Array --:  " + intArray.length);
		whileLoop();
		ArrayInteger ais = new ArrayInteger();
		ais.doWhileLoop(intArray);
		ais.enhancedForLoop(intArray);

		int[] array = forLoop(intArray);
		System.out.println("forLoop -- : " + array);

		String[] str = returnArray();
		for (int i = 0; i < str.length; i++) {
			System.out.println("String Array Return An Array : " + str[i]);
		}

	}

	public static void whileLoop() {
		int[] intArray = { 9, 8, 7, 6, 5 };
		int i = 0;
		while (i < intArray.length) {
			System.out.println("Use WhileLoop  -- :  " + intArray[i]);
			i++;
		}
	}

	public void doWhileLoop(int[] arrayInt) {
		if (arrayInt.length > 0) {
			int i = 0;
			do {
				System.out.println("Do-While -- :  " + arrayInt[i]);
				i++;
			} while (i < arrayInt.length);
		}
	}

	public static int[] forLoop(int[] intarray) {
		int size = 0;
		for (int i = 0; i < intarray.length; i++) {
			size = intarray[i];
		}
		return intarray;
	}

	public void enhancedForLoop(int[] array) {
		for (int i : array) {
			System.out.println("enhanced ForLoop -- : " + i);
		}
	}

	public static String[] returnArray() {
		String[] stringArray = { "PM", "CM", "MP", "MLA" };
		return stringArray;
	}

}
