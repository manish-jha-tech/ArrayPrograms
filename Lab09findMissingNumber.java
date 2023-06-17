package com.array.program;

public class Lab09findMissingNumber {
	public static void main(String[] args) {
		int n = 8;
		int[] a = { 1, 4, 5, 3, 7, 8, 6 };
		findMissingNumber(a, n);

	}

	public static void findMissingNumber(int a[], int n) {
		int expectedTotal = n * (n + 1) / 2;
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		System.out.println("Missing number is " + (expectedTotal - total));

	}

}
