package com.array.program;

import java.util.Arrays;

public class Lab19MergeTwoUnsortedArraysInSortedOrder {
	public static void main(String[] args) {
		int[] arrayA = new int[] { 12, -7, 18, 9, 37, -1, 21 };
		int[] arrayB = new int[] { 27, 8, 71, -9, 18 };
		int sortedArray[] = new int[arrayA.length + arrayB.length];
		int a = 0;
		int b = 0;
		int c = 0;
		while (a < arrayA.length) {
			sortedArray[c] = arrayA[a];
			a++;
			c++;
		}
		while (b < arrayB.length) {
			sortedArray[c] = arrayB[b];
			c++;
			b++;
		}
		Arrays.sort(sortedArray);
		System.out.println(Arrays.toString(sortedArray));

	}

}
