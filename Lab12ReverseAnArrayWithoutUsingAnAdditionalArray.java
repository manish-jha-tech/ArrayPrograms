package com.array.program;

import java.util.Arrays;

public class Lab12ReverseAnArrayWithoutUsingAnAdditionalArray {
	public static void main(String[] args) {
		int arr[] = { 891, 569, 921, 187, 343, 476, 555 };
		reverseArray(arr);
	}

	public static void reverseArray(int inputArray[]) {
		int startIndex = 0;
		int endIndex = inputArray.length - 1;
		while (startIndex < endIndex) {
			int temp = inputArray[endIndex];
			inputArray[endIndex] = inputArray[startIndex];
			inputArray[startIndex] = temp;
			startIndex++;
			endIndex--;
		}
		System.out.println(Arrays.toString(inputArray));

	}

}
