package com.bridgelabz.bubblesort;

import java.util.Scanner;

public class BubbleSort {

	private static <T extends Comparable<T>> void bubbleSort(T[] intWordList) {
		{
			int sizeOfList = intWordList.length;

			for (int i = 0; i < sizeOfList - 1; i++) {

				for (int j = 0; j < sizeOfList - i - 1; j++) {

					if (intWordList[j].compareTo(intWordList[j + 1]) > 0) {
						T placeHolder = intWordList[j];
						intWordList[j] = intWordList[j + 1];
						intWordList[j + 1] = placeHolder;
					}
				}
			}

			System.out.print("The sorted list: ");
			for (int index = 0; index < sizeOfList; index++)
				System.out.print(intWordList[index] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values to be sort: ");
		String inputString = scanner.nextLine();
		String[] wordsList = inputString.toLowerCase().split(" ");
		bubbleSort(wordsList);
		scanner.close();
	}

}
