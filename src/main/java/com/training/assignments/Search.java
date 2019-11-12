package com.training.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {

	public static int[] findMissingNumbers(int[] numbers) {
		Arrays.sort(numbers);

		int j = 0;

		ArrayList<Integer> missingNumbersList = new ArrayList<>();

		for (int index = 0; index <= numbers.length - 1; index++) {

			if (numbers[index] == j) {
				j++;
				continue;
			} else {
				missingNumbersList.add(j);
				j++;

			}
		}

		int[] missingNumbers = new int[missingNumbersList.size()];
		for (int counter = 0; counter < missingNumbersList.size(); counter++) {
			missingNumbers[counter] = missingNumbersList.get(counter);
		}
		return missingNumbers;
	}

}
