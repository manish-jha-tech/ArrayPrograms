package com.array.program;

import java.util.HashMap;
import java.util.Map;

public class Lab15FindTheMostFrequentElementInAnArray {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 8, 7, 4, 7, 6, 7 };
		findMostFrequentElement(arr);
	}

	public static void findMostFrequentElement(int arr[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : arr) {
			if (hm.containsKey(i))
				hm.put(i, hm.get(i) + 1);
			else
				hm.put(i, 1);
		}
		int frequancy = 0;
		int mostFrequentElement = 0;
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > frequancy) {
				frequancy = entry.getValue();
				mostFrequentElement = entry.getKey();
			}
		}
		System.out.println(mostFrequentElement);

	}

}
