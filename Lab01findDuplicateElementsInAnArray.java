package com.array.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab01findDuplicateElementsInAnArray {

	public static void main(String[] args) {
		int arr[] = { 111, 333, 555, 777, 333, 444, 555 };
//		findDuplicateByBruteForce(arr);
//		fundBySorting(arr);
//		findDuplicatesUsingHashSet(arr);
		findDuplicatesUsingHashMap(arr);

	}

	public static void findDuplicateByBruteForce(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}

		}
	}

	public static void fundBySorting(int arr[]) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}

	}

	public static void findDuplicatesUsingHashSet(int arr[]) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				System.out.println(arr[i]);
			}
		}

	}

	public static void findDuplicatesUsingHashMap(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : arr) {
			if (hm.containsKey(i))
				hm.put(i, hm.get(i) + 1);
			else
				hm.put(i, 1);
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey());
		}
	}

}
