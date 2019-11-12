package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.assignments.SearchElement;
import com.training.assignments.exception.InvalidInputException;

public class SearchElementTest {
	/*
	 *checks output for search operation when element is present in
	 *the given array
	 */
	@Test
	public void testSeachOperationWithValidInputs() throws InvalidInputException {
		int[][] elements = new int[][] {{1,2,3},{8,6,2}};
		assertEquals(true, SearchElement.searchingElementInMultiDimensionalArray(elements,2));
	}
	/*
	 *checks output for search operation when element is not present in
	 *the given array
	 */
	@Test
	public void testSeachOperationWithNonPresentElement() throws InvalidInputException {
		int[][] elements = new int[][] {{1,2,3},{8,6,2}};
		assertEquals(false, SearchElement.searchingElementInMultiDimensionalArray(elements,0));
	}
	/*
	 *checks output for search operation when array is empty
	 */
	@Test(expected = InvalidInputException.class)
	public void testSeachOperationWithEmptyArray() throws InvalidInputException {
		int[][] elements = new int[][] {};
	    SearchElement.searchingElementInMultiDimensionalArray(elements,2);
	}

}
