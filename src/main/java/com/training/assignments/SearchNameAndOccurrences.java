package com.training.assignments;

import com.training.assignments.exception.InvalidInputException;

public class SearchNameAndOccurrences {

	public static int getOccurrencesOfGivenString(String[] strings,String name) throws InvalidInputException{
		/*Raising exception when given array of names and
		 * name are empty.
		 */
		if(strings.length ==0 || name.length()==0) {
			throw new InvalidInputException("Inputs cannot be null");
		}
		/*Initializing occurence to zero
		 */
		int occurrence=0;
		/*finding name in the array
		 * and counting its occurrence
		 */
		for(int index=0;index<strings.length;index++) {
			if(name.equalsIgnoreCase(strings[index])) {
				occurrence++;
			}
		}
		return occurrence;
		
	}
}
