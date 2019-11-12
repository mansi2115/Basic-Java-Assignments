package com.training.assignments;

import java.util.Arrays;
import java.util.HashMap;

public class StringManipulation {


	public static boolean checkPalindrome(String string) {

		String string_copy, reverse;
		string_copy = string;
		reverse = new StringBuffer(string).reverse().toString();
		if (string_copy.equals(reverse)) {
			return true;
		} else {
			return false;
		}

	}

	public static String sortInDescendingOrder(String string) {

		char[] characters = string.toCharArray();
		Arrays.sort(characters);
		string = new StringBuffer(String.valueOf(characters)).reverse().toString();

		return string;

	}

	public static HashMap<String, Integer> findPalindromeStringsWithLength(String[] strings) {

		HashMap<String, Integer> palindromeStringsWithLength = new HashMap<String, Integer>();
		for (int index = 0; index <= strings.length - 1; index++) {
			if (checkPalindrome(strings[index])) {

				palindromeStringsWithLength.put(sortInDescendingOrder(strings[index]), strings[index].length());
			}
		}

		return palindromeStringsWithLength;

	}

}
