package com.programs;

public class DefaultSize {
	public static void main(String[] args) {

		int[] i = new int[5];
		float[] f = new float[5];
		double[] d = new double[5];
		long[] l = new long[5];
		char[] ch = new char[5];
		String[] str = new String[5];
		boolean[] bo = new boolean[5];
		Integer[] nt = new Integer[5];
		Double[] wD = new Double[5];
		Character[] wC = new Character[5];
		Boolean[] br = new Boolean[5];

		for (int j = 0; j < 1; j++) {
			System.out.println("Int -- " + i[j]);
			System.out.println("f -- " + f[j]);
			System.out.println("d -- " + d[j]);
			System.out.println("L -- " + l[j]);
			System.out.println("char -- " + ch[j]);
			System.out.println("String-- " + str[j]);
			System.out.println("bool-- " + bo[j]);
			System.out.println("int wrapper-- " + nt[j]);
			System.out.println("Wrapper Double -- " + wD[j]);
			System.out.println("Wrapper Character -- " + wC[j]);
			System.out.println("Wrapper Boolean -- " + br[j]);

		}
	}
}
