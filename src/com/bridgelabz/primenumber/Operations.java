package com.bridgelabz.primenumber;

import java.util.Arrays;

public class Operations {

	static boolean isAnagram(String firstString, String secondString) {

		if (firstString.length() != secondString.length())
			return false;
		char[] firstCharArray = firstString.toCharArray();
		char[] secondCharArray = secondString.toCharArray();

		Arrays.sort(firstCharArray);
		Arrays.sort(secondCharArray);

		return Arrays.equals(firstCharArray, secondCharArray);

	}

	static boolean isPalindrome(String firstString, String secondString) {
		if (firstString.length() != secondString.length())
			return false;
		int stringLength = firstString.length();
		for (int i = 0; i < stringLength; i++) {
			if (firstString.charAt(i) != secondString.charAt(stringLength - i - 1)) {
				return false;
			}
		}
		return true;
	}

	static void findAnagramsAndPalindrome(String array[]) {
		int sizeOfArray = array.length;
		for (int i = 0; i < sizeOfArray; i++) {
			for (int j = i + 1; j < sizeOfArray; j++) {
				if (isAnagram(array[i], array[j]) && isPalindrome(array[i], array[j])) {
					System.out.println(array[i] + " is anagram and palindrome of " + array[j]);
				}
			}
		}
	}
}
