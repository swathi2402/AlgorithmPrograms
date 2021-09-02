package com.bridgelabz.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMain {

	private static int binarySearch(String[] wordsList, String word) {
		int startIndex = 0;
		int endIndex = wordsList.length - 1;

		while (startIndex <= endIndex) {
			int middleIndex = startIndex + (endIndex - startIndex) / 2;
			int isFound = word.compareTo(wordsList[middleIndex]);

			if (isFound == 0) {
				return middleIndex;
			}

			if (isFound > 0) {
				startIndex = middleIndex + 1;
			} else {
				endIndex = middleIndex - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = scanner.nextLine();
		String[] wordsList = inputString.split(" ");
		Arrays.sort(wordsList);
		System.out.println("Enter the word to search: ");
		String word = scanner.nextLine();
		int isPresent = binarySearch(wordsList, word);
		if (isPresent == -1)
			System.out.println("Word '" + word + "' is not present");
		else
			System.out.println("Word '" + word + "' is present");
		scanner.close();
	}
}
