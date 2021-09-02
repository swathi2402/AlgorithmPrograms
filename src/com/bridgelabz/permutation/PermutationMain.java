package com.bridgelabz.permutation;

import java.util.List;
import java.util.Scanner;

public class PermutationMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = scanner.next();
		inputString = inputString.toUpperCase();
		FindPermutationIF findPermutation = new FindPermutationImpl();
		List<String> permutationList = findPermutation.permutationIterative(inputString);
		System.out.println("The permutations of " + inputString + " in iterative way is: ");
		System.out.println(permutationList);
		findPermutation.permutationRecursive(inputString);
		scanner.close();
	}
}
