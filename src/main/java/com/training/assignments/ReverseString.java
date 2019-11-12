package com.training.assignments;

public class ReverseString {

	/*
	 * reversing the words in sentence
	 */
	public static String reverseString(String string) {
		String reverse_string = " ";
		String[] string_words;
		/*
		 * splitting sentence into array of words
		 */
		string_words = string.split(" ");

		int index = 0;
		while (index <= string_words.length - 1) {

			reverse_string = reverse_string + new StringBuffer(string_words[index]).reverse().toString() + " ";
			index++;
		}
	
		return reverse_string.trim();
	}

}
