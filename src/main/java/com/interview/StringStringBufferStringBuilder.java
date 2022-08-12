package com.interview;

public class StringStringBufferStringBuilder {

	public static void StrConcat(String str1) {
		str1 = str1 + "Edureka";
	}

	public static void StrBufConcat(StringBuffer str2) {
		str2.append("Edureka");
	}

	public static void StrBuildConcat(StringBuilder str3) {
		str3.append("Edureka");
	}

	public static void main(String[] args) {
		String str1 = "Hello!";
		StrConcat(str1);
		System.out.println("The final String is String - " + str1);

		StringBuffer str2 = new StringBuffer("Hello!");
		StrBufConcat(str2);
		System.out.println("The final String is StringBuffer - " + str2);

		StringBuilder str3 = new StringBuilder("Hello!");
		StrBuildConcat(str3);
		System.out.println("The final String is StringBuider - " + str3);

		PerformanceTest();
	}

	public static void PerformanceTest() {

		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer  : " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder : " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
