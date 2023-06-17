package com.array.program;

import java.util.Arrays;

public class Lab16minimumAbsoluteDifferenceBetweenAnyTwoElementsOfArray {
	public static void main(String[] args) {
		int arr[] = { 5, 8, 4, 2, 9, 0 };
		findMinAbsoluteDiff(arr);

	}

	public static void findMinAbsoluteDiff(int arr[]) {
		Arrays.sort(arr);
		int minAbsDiff = Math.abs(arr[1] - arr[0]);
		int firstNum = arr[0];
		int secondNum = arr[1];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] < minAbsDiff) {
				minAbsDiff = arr[i] - arr[i - 1];
				firstNum = arr[i - 1];
				secondNum = arr[i];
			}
		}
		System.out
				.println("First num : " + firstNum + " second num is : " + secondNum + " min abs diff : " + minAbsDiff);

	}

}
