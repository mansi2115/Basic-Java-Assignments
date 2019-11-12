package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.assignments.RemoveDuplicateChars;
import com.training.assignments.exception.InvalidInputException;

public class RemoveDuplicateCharsTest {
	/*
	 * checks output when string has duplicate characters 
	 */
	@Test
	public void testRemoveDuplicateCharsFromGivenWord() throws InvalidInputException {
		
		assertEquals("abc",RemoveDuplicateChars.removeDuplicateCharsFromWord("abcabcabc"));
	}
	/*
	 * checks output when string is empty 
	 */
	@Test(expected = InvalidInputException.class)
	public void testRemoveDuplicateOperationWithEmptyString() throws InvalidInputException {
		
		RemoveDuplicateChars.removeDuplicateCharsFromWord("");
	}
	/*
	 * checks output when string has distinct characters 
	 */
	@Test
	public void testRemoveDuplicateCharsWithWordHavingDistinctChars() throws InvalidInputException {
		
		assertEquals("abc",RemoveDuplicateChars.removeDuplicateCharsFromWord("abc"));
	}

}
