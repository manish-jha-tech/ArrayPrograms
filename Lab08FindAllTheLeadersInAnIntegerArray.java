package com.array.program;

public class Lab08FindAllTheLeadersInAnIntegerArray {
	public static void main(String[] args) {
		int arr[] = { 55, 67, 71, 57, 51, 63, 38 };
		int max = arr[arr.length - 1];
		System.out.println(max);
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println(max);
			}
		}
	}
}
