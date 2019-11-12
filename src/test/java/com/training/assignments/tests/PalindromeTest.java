package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.assignments.Palindrome;

public class PalindromeTest {
	/*
	 * testing  for positive palindrome number
	 */
	@Test
	public void testPalindromeOfValidPositiveNumber() {
		
		assertEquals(true, Palindrome.checkPalindrome("121"));
	}
	/*
	 * checks output for non palindrome number
	 */
	
	@Test
	public void testPalindromeOfInvalidPositiveNumber() {
		
		assertEquals(false, Palindrome.checkPalindrome("10"));
	}
	/*
	 * checking whether negative number is palindrome or not
	 */
	@Test
	public void testPalindromeOfNegativeNumber() {
		
		assertEquals(false, Palindrome.checkPalindrome("-121"));
	}
	/*
	 * check output for palindrome string
	 */
	@Test
	public void testPalindromeOfValidString() {
		
		assertEquals(true, Palindrome.checkPalindrome("aaa"));
	}
	/*
	 * checks output for non palindrome string
	 */
	@Test
	public void testPalindromeOfInvalidString() {
		
		assertEquals(false, Palindrome.checkPalindrome("abc"));
	}
}
