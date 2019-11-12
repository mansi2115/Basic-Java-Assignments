package com.training.assignments;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.training.assignments.exception.InvalidInputException;

public class RemoveDuplicateChars {

	/*Removing duplicate characters from given string
	 * 
	 */
	public static String removeDuplicateCharsFromWord(String string) throws InvalidInputException {
		/*Raising exception when given
		 * string is empty.
		 */
		if(string.length()==0) {
			throw new InvalidInputException("String cannot be null");
		}
		String stringWithDistinctChars = Arrays.asList(string.split(""))
				.stream()
				.distinct()
				.collect(Collectors.joining());
		return stringWithDistinctChars;
	}

}
