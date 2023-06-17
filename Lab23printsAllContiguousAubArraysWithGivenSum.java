package com.array.program;
/*
 * https://www.youtube.com/watch?v=20v8zSo2v18&t=6s
 */

import java.util.HashMap;

public class Lab23printsAllContiguousAubArraysWithGivenSum {
	public static void main(String[] args) {
		hashingMethod(new int[] { 2, 4, 2, 8, 3, 3, 2, -4, 12 }, 8);

	}

	public static void hashingMethod(int[] inputArray, int givenSum) {
		int sum = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(0, -1);
		for (int i = 0; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
			if (hm.containsKey(sum - givenSum)) {
				printSubArray(inputArray, hm.get(sum - givenSum) + 1, i);
			}
			hm.put(sum, i);

		}

	}

	private static void printSubArray(int[] inputArray, int start, int end) {
		System.out.print("[");

		for (int i = start; i <= end; i++) {
			System.out.print(" " + inputArray[i]);
		}

		System.out.println(" ]");
	}

}
