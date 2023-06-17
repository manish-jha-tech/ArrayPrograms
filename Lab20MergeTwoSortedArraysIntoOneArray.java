package com.array.program;

import java.util.Arrays;

public class Lab20MergeTwoSortedArraysIntoOneArray {
	public static void main(String[] args) {
		int[] arrayA = new int[] { -7, 12, 17, 29, 41, 56, 79 };
		int[] arrayB = new int[] { -9, -3, 0, 5, 19 };
		mergeTwoSortArray(arrayA, arrayB);
	}

	public static void mergeTwoSortArray(int arr1[], int arr2[]) {
		int a = 0;
		int b = 0;
		int c = 0;
		int mergedArray[] = new int[arr1.length + arr2.length];

		while (a < arr1.length && b < arr2.length) {
			if (arr1[a] < arr2[b]) {
				mergedArray[c] = arr1[a];
				c++;
				a++;
			} else {
				mergedArray[c] = arr2[b];
				c++;
				b++;
			}
		}
		while (a < arr1.length) {
			mergedArray[c] = arr1[a];
			a++;
			c++;
		}
		while (b < arr2.length) {
			mergedArray[c] = arr2[b];
			c++;
			b++;
		}
		System.out.println(Arrays.toString(mergedArray));

	}

}
