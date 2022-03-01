package com.programs;

public class Palindrome {
	public static void main(String[] args) {
		isPalindrome();
		isArmstrong();
	}

	static void isArmstrong() {
		int temp, rem, sum = 0, n = 153;
		temp = n;
		while (n > 0) {
			rem = n % 10;
			sum = sum + rem * rem * rem;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(temp + "--Is    --Armstrong--");
		} else {
			System.out.println(temp + "--Is Not --Armstrong--");
		}
	}

	static void isPalindrome() {
		int rem, temp, sum = 0, num = 121;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(temp + "--Is  --Palindrome--");
		} else {
			System.out.println(temp + "--Not --Palindrome--");
		}
	}
}
