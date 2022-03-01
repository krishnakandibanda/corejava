package com.array;

public class ArrayString {
	static String[] stringArray = new String[] { "Village", "Mandel", "Dist", "State", "Countrie" };

	public static void main(String[] args) {

		System.out.println("String Array Size -- :  " + stringArray.length);
		ArrayString as = new ArrayString();
		as.forloop(stringArray);
		enhancedForLoop();
		whileLoop();
		doWhileLoop(stringArray);

	}

	public void forloop(String[] stringArr) {
		for (int i = 0; i < stringArr.length; i++) {
			System.out.println("StringArray ForLoop - " + stringArr[i]);
		}
	}

	public static void whileLoop() {
		String[] strarray = new String[] { "KSH", "KVG", "KSR", "KVK" };
		int i = 0;
		while (i < strarray.length) {
			System.out.println("While-Loop -  " + strarray[i]);
			i++;
		}
	}

	public static void doWhileLoop(String[] strArray) {
		if (strArray.length > 0) {
			int i = 0;
			do {
				System.out.println("-Do-While-Loop -- " + strArray[i]);
				i++;
			} while (i < strArray.length);
		}
	}

	public static void enhancedForLoop() {
		char[] charArray = new char[] { 'A', 'F', 'B', 'D' };
		for (char i : charArray) {
			System.out.println("CharArray--enhancedForLoop - " + i);
		}
	}

}
