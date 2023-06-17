package com.array.program;

import java.util.Arrays;

public class Lab13RemoveDuplicateElementsFromAnArray {
	public static void main(String[] args) {
		// int arr[] = { 7, 3, 21, 7, 34, 18, 3, 21 };
		int arr[] = { 7, 3, 7, 2 };
		removeDuplicateElementFromArray(arr);
	}

	public static void removeDuplicateElementFromArray(int duplicateArray[]) {
		System.out.println("Duplicate Array :" + Arrays.toString(duplicateArray));
		int numberOfUniqueElement = duplicateArray.length;
		for (int i = 0; i < numberOfUniqueElement; i++) {
			for (int j = i + 1; j < numberOfUniqueElement; j++) {
				if (duplicateArray[i] == duplicateArray[j]) {
					duplicateArray[j] = duplicateArray[numberOfUniqueElement - 1];
					numberOfUniqueElement--;
					j--;

				}
			}
		}
		int uniqueArray[] = Arrays.copyOf(duplicateArray, numberOfUniqueElement);
		System.out.println(Arrays.toString(uniqueArray));
	}

}
