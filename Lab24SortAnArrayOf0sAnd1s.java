package com.array.program;

import java.util.Arrays;

/*
 * https://www.youtube.com/watch?v=ypmtVDK4Srk
 */

public class Lab24SortAnArrayOf0sAnd1s {
	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 1, 0, 1, 0, 0 };
		segregrate0And1(arr);

	}

	public static void segregrate0And1(int arr[]) {
		int leftIndex = 0;
		int rightIndex = arr.length - 1;
		while (leftIndex < rightIndex) {
			if (arr[leftIndex] == 1) {
				int temp = arr[rightIndex];
				arr[rightIndex] = arr[leftIndex];
				arr[leftIndex] = temp;
				rightIndex--;
			} else {
				leftIndex++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
