package com.bridgelabz.permutation;

import java.util.ArrayList;
import java.util.List;

public class FindPermutationImpl implements FindPermutationIF {
	@Override
	public List<String> permutationIterative(String string) {
		if (string == null || string.length() == 0) {
			return null;
		}

		List<String> intermediate = new ArrayList<>();

		intermediate.add(String.valueOf(string.charAt(0)));

		for (int i = 1; i < string.length(); i++) {

			for (int j = intermediate.size() - 1; j >= 0; j--) {
				String current = intermediate.remove(j);

				for (int k = 0; k <= current.length(); k++) {
					intermediate.add(current.substring(0, k) + string.charAt(i) + current.substring(k));
				}
			}
		}

		return intermediate;
	}

	@Override
	public void permutationRecursive(String string) {
		System.out.println("The permutations of " + string + " in recursive way is: ");
		permutationRecursive("", string);
	}

	private void permutationRecursive(String charecter, String string) {
        if (string.isEmpty()) {
            System.out.println(charecter + string);
        } else {
            for (int i = 0; i < string.length(); i++) {
            	permutationRecursive(charecter + string.charAt(i), string.substring(0, i) 
                                + string.substring(i + 1, string.length()));
            }
        }
    }
}
