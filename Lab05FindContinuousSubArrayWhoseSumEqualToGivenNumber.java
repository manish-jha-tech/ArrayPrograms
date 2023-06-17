package com.array.program;
/*
 * https://www.youtube.com/watch?v=GlQpAlMiqBo
 */
public class Lab05FindContinuousSubArrayWhoseSumEqualToGivenNumber {
	public static void main(String[] args) {
		int arr[] = { 15, 51, 7, 81, 5, 11, 25 };
		int num = 41;
		findContinuousSubArray(arr, num);
	}

	public static void findContinuousSubArray(int arr[], int num) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == num) {
					for (int k = i; k <= j; k++) {
						System.out.print(arr[k] + " ");
					}
				} else if (sum > num) {
					break;
				}
			}
		}

	}

}
