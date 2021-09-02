package com.bridgelabz.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class DetectAnagram {

	private static void detectAnagram(String firstWord, String secondWord) {
		if (firstWord.length() == secondWord.length()) {

			char[] firstCharArray = firstWord.toCharArray();
			char[] secondCharArray = secondWord.toCharArray();

			Arrays.sort(firstCharArray);
			Arrays.sort(secondCharArray);

			boolean result = Arrays.equals(firstCharArray, secondCharArray);

			if (result) {
				System.out.println(firstWord + " and " + secondWord + " are anagram.");
			} else {
				System.out.println(firstWord + " and " + secondWord + " are not anagram.");
			}
		} else {
			System.out.println(firstWord + " and " + secondWord + " are not anagram.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first word: ");
		String firstWord = scanner.nextLine().toLowerCase();
		System.out.println("Enter the second word: ");
		String secondWord = scanner.nextLine().toLowerCase();
		detectAnagram(firstWord, secondWord);
		scanner.close();
	}
}
