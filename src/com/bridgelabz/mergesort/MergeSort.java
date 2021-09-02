package com.bridgelabz.mergesort;

import java.util.Scanner;

public class MergeSort {

	private static void mergeSort(String[] wordsList, int lengthOfArray) {
		if (lengthOfArray < 2) {
			return;
		}

		int middleIndex = lengthOfArray / 2;
		String[] leftHalf = new String[middleIndex];
		String[] rightHalf = new String[lengthOfArray - middleIndex];

		int k = 0;
		for (int index = 0; index < lengthOfArray; index++) {
			if (index < middleIndex) {
				leftHalf[index] = wordsList[index];
			} else {
				rightHalf[k] = wordsList[index];
				k = k + 1;
			}
		}

		mergeSort(leftHalf, middleIndex);
		mergeSort(rightHalf, lengthOfArray - middleIndex);
		merge(leftHalf, rightHalf, wordsList);
	}

	private static void merge(String[] leftHalf, String[] rightHalf, String[] wordsList) {
		int index = 0, leftIndex = 0, rightIndex = 0;
		while (leftIndex < leftHalf.length && rightIndex < rightHalf.length) {

			if (leftHalf[leftIndex].compareTo(rightHalf[rightIndex]) < 0) {
				wordsList[index++] = leftHalf[leftIndex++];
			} else {
				wordsList[index++] = rightHalf[rightIndex++];
			}
		}
		while (leftIndex < leftHalf.length) {
			wordsList[index++] = leftHalf[leftIndex++];
		}
		while (rightIndex < rightHalf.length) {
			wordsList[index++] = rightHalf[rightIndex++];
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to be sort: ");
		String inputString = scanner.nextLine();
		String[] wordsList = inputString.toLowerCase().split(" ");
		mergeSort(wordsList, wordsList.length);
		System.out.print("The sorted words list: ");
		for (int index = 0; index < wordsList.length; index++) {
			System.out.print(wordsList[index] + " ");
		}
		scanner.close();
	}

}
