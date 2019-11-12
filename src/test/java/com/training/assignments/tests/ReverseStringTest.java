package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.assignments.ReverseString;

public class ReverseStringTest {
	/*
	 * checks whether the words of sentence are reversed or not
	 */
	@Test
	public void testReversingOperationWithSentence() {
		assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseString.reverseString("Let's take LeetCode contest"));
	}

}
