package com.array.program;

import java.util.Arrays;

public class Lab03EqualityOfTwoArrays {
	public static void main(String[] args) {
		int[] arrayOne = { 2, 5, 1, 7, 1};
		int[] arrayTwo = { 2, 5, 1, 7, 4 };
		checkByIterativeMethod(arrayOne, arrayTwo);
		checkByEqualsMethod(arrayOne, arrayTwo);
	}

	public static void checkByIterativeMethod(int arrayOne[], int[] arrayTwo) {

		boolean isEqual = true;
		if (arrayOne.length != arrayTwo.length) {
			isEqual = false;
			System.out.println("Both arrays are equal is " + isEqual);
			return;
		}

		for (int i = 0; i < arrayOne.length; i++) {
			if (arrayOne[i] != arrayTwo[i]) {
				isEqual = false;
				break;
			}
		}
		System.out.println("Both arrays are equal is " + isEqual);
	}

	public static void checkByEqualsMethod(int arrayOne[], int[] arrayTwo) {
		System.out.println("Both arrays are equal is " + Arrays.equals(arrayOne, arrayTwo));
	}

}
