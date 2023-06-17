/*
 * https://www.youtube.com/watch?v=U4iVyHQQIqA&t=992s
 */
package com.array.program;

public class Lab22KadanesAlgorithmContiguousSubArrayWithMaximumSum {
	public static void main(String[] args) {
		int arr[] = { 2, -3, 7, -4, 2, 5, -8, 6, -1 };
		getSubArrayWithMaxSum(arr);

	}

	public static void getSubArrayWithMaxSum(int arr[]) {

		int maxSoFar = Integer.MIN_VALUE;
		int maxAtEnd = 0;
		int s = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			maxAtEnd = maxAtEnd + arr[i];
			if (maxAtEnd > maxSoFar) {
				maxSoFar = maxAtEnd;
				start = s;
				end = i;
			} else if (maxAtEnd < 0) {
				s = i + 1;
			}
		}
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
