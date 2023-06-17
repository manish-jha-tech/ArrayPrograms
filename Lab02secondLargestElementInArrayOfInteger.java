package com.array.program;

public class Lab02secondLargestElementInArrayOfInteger {

	public static void main(String[] args) {
		int arr[] = { 9459, 9575, 5692, 1305, 1942, 9012 };
		findSecondLargestNumber(arr);
	}

	public static void findSecondLargestNumber(int arr[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		System.out.println("max is" + " " + max);
		System.out.println("second max is " + secondMax);
	}
}
