package com.bridgelabz.findnumber;

import java.util.Scanner;

public class FindYourNumber {
	static int number, middle, lower, upper, count;
	static String input;

	static Scanner scanner = new Scanner(System.in);

	public static void findNumber() {
		System.out.println("Enter your answer in 'yes', 'true' or 'false'");
		System.out.println("Is your number between " + lower + " and " + middle);
		input = scanner.nextLine();
		do {
			if (input.equals("true")) {
				upper = middle;
				count++;
			} else if (input.equals("false")) {
				lower = middle;
				count++;
			} else if (input.equals("yes")) {
				System.out.println("The number you thought was: " + middle);
				count++;
				System.out.println("It took " + count + " questions to find your number");
				break;
			}

			if (count <= number) {
				middle = (lower + upper) / 2;
				System.out.println("Is your number between " + lower + " and " + middle);
				input = scanner.nextLine();
			}
		} while (lower <= upper && count <= number);

		if (count > number) {
			System.out.println("Could not find the number you thought");
		}

	}

	public static void main(String[] args) {
		number = Integer.parseInt(args[0]);
		upper = (int) Math.pow(2, number - 1);
		lower = 0;
		middle = (lower + upper) / 2;
		count = 0;
		System.out.println("Think of a number between 0 and " + upper);
		findNumber();
	}

}
