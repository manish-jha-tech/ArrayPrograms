package com.array.program;

public class Lab21AmallestAndSecondSmallestElement {

	public static void main(String[] args) {
		int arr[] = { 17, 11, 23, 64, 41, 88, 35 };
		findSmallestAndSecondSmallestNum(arr);
	}

	public static void findSmallestAndSecondSmallestNum(int arr[]) {
		int smallest = arr[0];
		int secondSmallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] < secondSmallest && arr[i] > smallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("Smallest is :" + smallest + " second smallest is " + secondSmallest);

	}
}
