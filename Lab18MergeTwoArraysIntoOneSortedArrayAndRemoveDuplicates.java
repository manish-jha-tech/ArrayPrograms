package com.array.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Lab18MergeTwoArraysIntoOneSortedArrayAndRemoveDuplicates {
	public static void main(String[] args) {
		int[] arrayA = new int[] { 7, -5, 3, 8, -4, 11, -19, 21 };
		int[] arrayB = new int[] { 6, 13, -7, 0, 11, -4, 3, -5 };
		sortAndRemoveDuplicate(arrayA, arrayB);
	}

	public static void sortAndRemoveDuplicate(int arr1[], int arr2[]) {
		int a = 0;
		int b = 0;
		int c = 0;

		int duplicateArray[] = new int[arr1.length + arr2.length];
		while (a < arr1.length) {
			duplicateArray[c] = arr1[a];
			a++;
			c++;
		}
		while (b < arr2.length) {
			duplicateArray[c] = arr2[b];
			b++;
			c++;
		}
		System.out.println(Arrays.toString(duplicateArray));
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < duplicateArray.length; i++) {
			hs.add(duplicateArray[i]);
		}
		int uniqueArray[] = new int[hs.size()];
		int index = 0;
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			uniqueArray[index] = it.next();
			index++;
		}
		Arrays.sort(uniqueArray);
		System.out.println(Arrays.toString(uniqueArray));
	}

}
