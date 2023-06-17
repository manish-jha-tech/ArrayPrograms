package com.array.program;

import java.util.Arrays;
import java.util.HashSet;

public class Lab06indTheIntersectionOfTwoArrays {
	public static void main(String[] args) {
		String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };
		String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };
		findIntersectionByIterative(s1, s2);
		retainAll(s1, s2);

	}

	public static void findIntersectionByIterative(String str1[], String str2[]) {
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equals(str2[j]))
					set.add(str1[i]);

			}
		}
		System.out.println(set);
	}

	public static void retainAll(String str1[], String str2[]) {
		HashSet<String> set1 = new HashSet<>(Arrays.asList(str1));
		HashSet<String> set2 = new HashSet<>(Arrays.asList(str2));
		set1.retainAll(set2);
		System.out.println(set1);
	}

}
