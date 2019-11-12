package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.assignments.CalculateDiscount;
import com.training.assignments.exception.InvalidInputException;

public class CalculateDiscountTest {
	/*
	 * calculate discount when price is zero
	 */
	@Test(expected = InvalidInputException.class)
	public void testCalulateDiscountOperationWithZeroPrice() throws InvalidInputException {
		CalculateDiscount.calculateDiscount(0);		
	}
	/*
	 * calculate discount when price is negative
	 */
	@Test(expected = InvalidInputException.class)
	public void testCalulateDiscountOperationWithLessThanZeroPrice() throws InvalidInputException {
		CalculateDiscount.calculateDiscount(-1);		
	}
	
	/*
	 * calculate discount when price is greater than zero
	 */
	@Test
	public void testCalulateDiscountOperationWithGreaterThanZeroPrice() throws InvalidInputException {
		assertEquals(6.5,CalculateDiscount.calculateDiscount(10),0.01);		
	}
}
