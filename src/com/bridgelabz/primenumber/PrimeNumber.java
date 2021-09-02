package com.bridgelabz.primenumber;

public class PrimeNumber {

	private static String primeNumbers() {
		String primeNumbers = "";

		for (int number = 3; number <= 1000; number++) {
			int encounter = 0;

			for (int index = number; index >= 1; index--) {
				if (number % index == 0) {
					encounter = encounter + 1;
				}
			}

			if (encounter == 2) {
				primeNumbers = primeNumbers + number + " ";
			}
		}
		return primeNumbers;
	}

	public static void main(String[] args) {
		String primeNumber = primeNumbers();
		System.out.println("Prime numbers between 1 to 1000:");
		System.out.println(primeNumber);
		String[] primeArray = primeNumber.split(" ");
//		int sizeOfArray = primeArray.length;
		Operations.findAnagramsAndPalindrome(primeArray);
	}
}
