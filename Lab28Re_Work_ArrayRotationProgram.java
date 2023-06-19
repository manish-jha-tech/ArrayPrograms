package com.array.program;

import java.util.Arrays;

/*
 * https://www.youtube.com/watch?v=8RErc0VXAo8
 * Right rotational
 */

public class Lab28ArrayRotationProgram {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Before rotate " + Arrays.toString(arr));
		int k = 2;
		//rorateRight(arr, k);
		//System.out.println("After right rotate " + Arrays.toString(arr));
		rotateLeft(arr,k);
		System.out.println("After left rotate " + Arrays.toString(arr));

	}

	public static void rorateRight(int arr[], int k) {
		k = k % arr.length;
		if (k < 0) {
			k = k + arr.length;
		}
		reverse(arr, 0, arr.length - k - 1);
		reverse(arr, arr.length - k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	public static void rotateLeft(int arr[], int k) {
		k = k % 10;
		if (k < 0) {
			k = k + arr.length;
		}
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
		reverse(arr, 0, arr.length - 1);

	}

	public static void reverse(int arr[], int i, int j) {
		int start = i;
		int end = j;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
