package com.array.program;

import java.util.Arrays;

public class Lab07SeparateZerosFromNonZeros {
	public static void main(String[] args) {
		int arr[] = { 12, 0, 7, 0, 8, 0, 3 };
		moveZeroToEnd(arr);
		moveZeroToFront(arr);

	}

	public static void moveZeroToEnd(int arr[]) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[counter] = arr[i];
				counter++;
			}
		}
		while (counter < arr.length) {
			arr[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void moveZeroToFront(int arr[]) {
		int counter = arr.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[counter] = arr[i];
				counter--;
			}
		}
		while (counter >= 0) {
			arr[counter] = 0;
			counter--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
