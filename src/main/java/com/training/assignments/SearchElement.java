package com.training.assignments;

import com.training.assignments.exception.InvalidInputException;

public class SearchElement {

public static boolean searchingElementInMultiDimensionalArray(int[][] elementArray, int element) throws InvalidInputException {
		
		/*throw exception when array is empty
		 * 
		 */
		if (elementArray.length == 0 ) {
			throw new InvalidInputException("Array cannot be null");
		}

		boolean valuePresent = false;
		
		/*Searching element in array
		 * 
		 */
		for (int i = 0; i < elementArray.length; i++) {
			
			for (int j = 0; j < elementArray[i].length; j++) {
				if (elementArray[i][j] == element) {
					valuePresent=true;
					break;		
				}
			}
		}
		return valuePresent;
	}
	
}
