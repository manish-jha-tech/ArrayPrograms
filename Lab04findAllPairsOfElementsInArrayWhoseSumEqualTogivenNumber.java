package com.array.program;
/*
 * https://www.youtube.com/watch?v=tmki0OoLqIg
 */

import java.util.Arrays;

public class Lab04findAllPairsOfElementsInArrayWhoseSumEqualTogivenNumber {
	public static void main(String[] args) {
		int arr[] = { 4, -5, 9, 11, 25, 13, 12, 8 };
		int num = 20;
		// findPairByBruiteForce(arr, num);
		findPairByTwoPointer(arr, num);

	}

	public static void findPairByBruiteForce(int arr[], int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum)
					System.out.println(arr[i] + " " + arr[j]);
			}
		}
	}

	public static void findPairByTwoPointer(int arr[], int num) {
		Arrays.sort(arr);
		int startIndex = 0;
		int endIndex = arr.length - 1;
		int sum = 0;
		while (startIndex < endIndex) {
			sum = arr[startIndex] + arr[endIndex];
			if (sum == num) {
				System.out.println(arr[startIndex] + " " + arr[endIndex]);
				startIndex++;
				endIndex--;
			} else if (sum < num) {
				startIndex++;
			} else if (sum > num) {
				endIndex--;
			}

		}
	}

}
