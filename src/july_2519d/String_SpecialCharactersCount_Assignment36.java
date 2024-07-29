//String_SpecialCharactersCount #
package july_2519d;

import java.util.Arrays;

public class String_SpecialCharactersCount_Assignment36 {

	static int count_of_alphabets = 0;
	static int count_of_digits = 0;
	static int count_of_spaces = 0;
	static int count_of_totalchar = 0;
	
	public static void main(String[] args) {

		String s1 = "venkat    12@@@  %^%^%^%^";
		char[] s2 = s1.toCharArray();
		System.out.println(Arrays.toString(s2));

		// To find alphabets are:

		for (int i = 0; i < s1.length(); i++) {
			Boolean ans = Character.isAlphabetic(s2[i]);
			if (ans == true) {
				count_of_alphabets++;
			}
		}
		System.out.println("String alphabets are ------> " + count_of_alphabets);

		// find numbers of string..
		for (int i = 0; i < s1.length(); i++) {
			Boolean ans = Character.isDigit(s2[i]);
			if (ans == true) {
				count_of_digits++;
			}
		}
		System.out.println("String digits  ------> " + count_of_digits);

		// find numbers of spaces..
		for (int i = 0; i < s1.length(); i++) {
			Boolean ans = Character.isSpaceChar(s2[i]);
			if (ans == true) {
				count_of_spaces++;
			}
		}
		System.out.println("String spaces are ------> " + count_of_spaces);

		count_of_totalchar = count_of_alphabets + count_of_digits + count_of_spaces;

		System.out.println("Special Characters Count ----> " + (s1.length() - count_of_totalchar));

	}

}
