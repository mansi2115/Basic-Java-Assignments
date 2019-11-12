package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.assignments.SentenceFormat;
import com.training.assignments.exception.InvalidInputException;

public class SentenceFormatTest {
	
	@Test
	public void testSentenceFormatOperationWithValidInputs() throws InvalidInputException {
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY",SentenceFormat.fomattingString("A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY","IS",6));
	}
	
	@Test(expected = InvalidInputException.class)
	public void testSentenceFormatOperationWithWrongPosition() throws InvalidInputException {
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY",SentenceFormat.fomattingString("A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY","IS",7));
	}
	
	@Test(expected = InvalidInputException.class)
	public void testSentenceFormatOperationWithInvalidWord() throws InvalidInputException {
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY",SentenceFormat.fomattingString("A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY","MAN",6));
	}
	
}
