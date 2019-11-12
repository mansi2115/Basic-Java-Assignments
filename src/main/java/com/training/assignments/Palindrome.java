package com.training.assignments;

public class Palindrome {

	/*
	 * returns true if given number is palindrome
	 */
	public static boolean checkPalindrome(String number) {
		
		String number_copy,reverse;
		number_copy=number;
		reverse=new StringBuffer(number).reverse().toString();
		System.out.println(reverse);
		if(number_copy.equals(reverse))
		{
			return true;
		}
		else {
			return false;
		}
		
		

       }
}
