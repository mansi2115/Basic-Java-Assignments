package com.training.assignments;

import com.training.assignments.exception.InvalidInputException;

public class SentenceFormat {
	
	
	public static String fomattingString(String string,String word,int position) throws InvalidInputException {
		// Splittig string into array of words
				String[] wordsArray = string.split("\\W+");
			
				if(position > wordsArray.length) {
					throw new InvalidInputException("Please Enter correct position.");
				}
				if(!wordsArray[position - 1].equals(word)) {
					throw new InvalidInputException("Your given word and position not matched.");
				}
				if(!string.contains(word)) {
					throw new InvalidInputException("Your given word is not present in the sentence.");

				}
				String sentence = "";
				
				for(int index = 0;index < wordsArray.length;index++) {
					
					/*If word and its position matches then delete it by ignoring it
					 * 
					 */
					if(wordsArray[index].equals(word) && index == position - 1) {
						continue;
					}	
					
					else if(index == wordsArray.length - 1) {
						sentence = sentence+wordsArray[index];
					}
					
					else {
						sentence = sentence+wordsArray[index]+" ";
					}
				}
				return sentence;
			
		
	}

}
