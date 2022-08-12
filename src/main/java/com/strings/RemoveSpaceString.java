package com.strings;

public class RemoveSpaceString {
	public static void main(String[] args) {

		String str = "  This   is j av a pro  jec ts of  ";
		String remove = str.trim();
		System.out.println("" + remove);
		String removemid = str.replaceAll("\\s", "");
		System.out.println(removemid);

	}
}
