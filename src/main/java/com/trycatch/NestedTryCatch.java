package com.trycatch;

public class NestedTryCatch {
	public static void main(String[] args) {

		try {// block 1
			try {// block 2
				try {// block 3
					int arr[] = { 1, 2, 4, 5 };
					System.out.println(".block 3---" + arr[10]);

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ArrayIndexOutOfBoundsException...in block 3 --");
					throw e;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException...in block 2 --");
				throw e;
			}
		} catch (ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException...in block 1 --");
			throw e4;
		} catch (Exception e4) {
			System.out.println(" General Exception --");
		}
	}
}
