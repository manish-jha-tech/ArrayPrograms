package com.array.program;
/*
 * https://www.youtube.com/watch?v=bZrgAfkrs9M
 */

import java.util.Arrays;

public class Lab26FindsTripletsInTheGivenArrayWhoseSumIsEqualToGivenNumber {
	public static void main(String[] args) {
		int arr[] = { 7, 5, 9, 3, 0, 8, 6 };
		int num = 12;
		findTripletsWhoseSumIsEqualToGivenNum(arr, num);
		findTripletsWhoseSumIsEqualToGivenNum(new int[] { -3, 7, -1, -5, 2, -9, 1 }, 0);

	}

	public static void findTripletsWhoseSumIsEqualToGivenNum(int arr[], int num) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 2; i++) {
			int left = i + 1;
			int right = arr.length - 1;
			while (left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				if (sum == num) {
					System.out.println("[ " + arr[i] + " " + arr[left] + " " + arr[right] + " ]");
					left++;
					right--;
				} else if (sum < num) {
					left++;
				} else if (sum > num) {
					right--;
				}

			}
		}

	}

}
