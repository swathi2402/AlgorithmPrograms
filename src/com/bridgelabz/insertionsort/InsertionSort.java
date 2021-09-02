package com.bridgelabz.insertionsort;

import java.util.Scanner;

public class InsertionSort {

	private static void insertionSort(String[] wordsList) {
		int sizeOfList = wordsList.length;
		
		for (int unsortedIndex = 0; unsortedIndex < sizeOfList; unsortedIndex++) {
			String key = wordsList[unsortedIndex];
			int sortedIndex = unsortedIndex - 1;
			
			while (sortedIndex >= 0 && wordsList[sortedIndex].compareTo(key) > 0) {
				wordsList[sortedIndex + 1] = wordsList[sortedIndex];
				sortedIndex = sortedIndex - 1;
			}
			wordsList[sortedIndex + 1] = key;
		}
		
		System.out.print("The sorted words list: ");
		for (int index = 0; index < sizeOfList; index++)
			System.out.print(wordsList[index] + " ");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to be sort: ");
		String inputString = scanner.nextLine();
		String[] wordsList = inputString.toLowerCase().split(" ");
		insertionSort(wordsList);
		scanner.close();
	}

}
