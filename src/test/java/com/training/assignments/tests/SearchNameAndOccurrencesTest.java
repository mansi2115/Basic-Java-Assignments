package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.assignments.SearchNameAndOccurrences;
import com.training.assignments.exception.InvalidInputException;

public class SearchNameAndOccurrencesTest {
	/*
	 *checks output for search operation when name is present in
	 *the given array of names
	 */
	@Test
	public void testFindNameAndItsOccurrencesInArrayWithValidInputs() throws InvalidInputException {
		
		String[] names={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};

		assertEquals(1,SearchNameAndOccurrences.getOccurrencesOfGivenString(names, "Dave"));
		
	}
	/*
	 *checks output for search operation when name is not present in
	 *the given array of names
	 */
	@Test
	public void testFindNameAndItsOccurrencesInArrayWithNonPresentName() throws InvalidInputException {
		
		String[] names={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};

		assertEquals(0,SearchNameAndOccurrences.getOccurrencesOfGivenString(names, "Abc"));
		
	}
	/*
	 *checks output for search operation when name and
	 *the given array of names is empty
	 */
	@Test(expected = InvalidInputException.class)
	public void testFindNameAndItsOccurrencesInArrayWithInvalidInputs() throws InvalidInputException {
		
		String[] names={};

		SearchNameAndOccurrences.getOccurrencesOfGivenString(names, "");
		
	}
	/*
	 *checks output for search operation when name is given
	 *but the array of names is empty
	 */
	@Test(expected = InvalidInputException.class)
	public void testFindNameAndItsOccurrencesInArrayWithEmptyArray() throws InvalidInputException {
		
		String[] names={};

		SearchNameAndOccurrences.getOccurrencesOfGivenString(names, "dave");
		
	}
}
