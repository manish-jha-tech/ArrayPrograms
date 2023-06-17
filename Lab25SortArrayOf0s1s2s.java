package com.array.program;

import java.util.Arrays;

public class Lab25SortArrayOf0s1s2s {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0 };
		sortArrayOf0s1s2s(arr);

	}

	public static void sortArrayOf0s1s2s(int arr[]) {
		int low = 0;
		int med = 0;
		int heigh = arr.length - 1;
		while (med <= heigh) {
			if (arr[med] == 0) {
				int temp = arr[low];
				arr[low] = arr[med];
				arr[med] = temp;
				low++;
				med++;
			} else if (arr[med] == 2) {
				int temp = arr[heigh];
				arr[heigh] = arr[med];
				arr[med] = temp;
				heigh--;
			} else if (arr[med] == 1) {
				med++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
