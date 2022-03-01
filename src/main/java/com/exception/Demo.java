package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
	public static void main(String[] args) {
		try {
			FileInputStream Fis = new FileInputStream(args[0]);
		} catch (FileNotFoundException fe) {
			System.out.println(fe);
		}
	}
}
