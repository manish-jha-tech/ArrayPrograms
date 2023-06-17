package com.array.program;

import java.util.HashSet;

public class Lab27FindArrayTripletsSuchThatSumOfFirstTwoElementsEqualsTheThirdElement {
	public static void main(String[] args) {
		int arr[] = { 21, 13, 47, 61, 34, 40, 55, 71, 87 };
		findTripletSuchThatFirstTwoElementsEqualsTheThirdElement(arr);

	}

	public static void findTripletSuchThatFirstTwoElementsEqualsTheThirdElement(int arr[]) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (hs.contains(arr[i] + arr[j])) {
					System.out.println(arr[i] + " " + arr[j] + " " + (arr[i] + arr[j]));
				}
			}
		}

	}

}
