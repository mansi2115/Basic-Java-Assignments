package com.training.assignments.tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.training.assignments.Search;

public class SearchTest {
	/*
	 * checks output when number is missing in the array of elements
	 */
	@Test
	public void testSearchOperationForMissingNumberWhenANumberIsMissing() {
		int[] numbers = { 3, 0, 1 };
		int[] actual = Search.findMissingNumbers(numbers);
		int[] expected = { 2 };
		assertArrayEquals(expected, actual);
	}
	/*
	 * checks output when number is not missing in the array of elements
	 */
	@Test
	public void testSearchOperationForMissingNumberWhenANumberIsNotMissing() {
		int[] numbers = { 0, 1, 2, 3 };
		int[] actual = Search.findMissingNumbers(numbers);
		int[] expected = {};
		assertArrayEquals(expected, actual);
	}
}
