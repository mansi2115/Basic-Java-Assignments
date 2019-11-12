package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import org.junit.Test;

import com.training.assignments.StringManipulation;

public class StringManipulationTest {

	@Test
	public void testPalindromeOfArrayOfStringsThatHasPalindromesAndCountCharsOfThatStringAndSortInDescending() {
		String[] inputStrings = { "121", "aaa", "10", "abc", "kajk", "-121", "123", "hcd", "111", "lol" };
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("aaa", 3);
		expected.put("111", 3);
		expected.put("211", 3);
		expected.put("oll", 3);

		assertEquals(expected, StringManipulation.findPalindromeStringsWithLength(inputStrings));

	}

	@Test
	public void testPalindromeOfArrayOfStringsThatDoNotHavePalindromesAndCountCharsOfThatStringAndSortInDescending() {
		String[] inputStrings = { "671", "ajak", "10", "abc", "kajk", "-121", "123", "hcd", "981", "snkk" };
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		assertEquals(expected, StringManipulation.findPalindromeStringsWithLength(inputStrings));

	}

}
