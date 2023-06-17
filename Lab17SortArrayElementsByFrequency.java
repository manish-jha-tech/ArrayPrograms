package com.array.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Lab17SortArrayElementsByFrequency {
	public static void main(String[] args) {
		int arr[] = { 7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3 };
		sortArrayByFrequency(arr);
	}

	public static void sortArrayByFrequency(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, (entry1, entry2) -> entry2.getValue() - entry1.getValue());
		System.out.print("[ ");
		for (Map.Entry<Integer, Integer> entry : list) {
			int frequency = entry.getValue();
			while (frequency >= 1) {
				System.out.print(entry.getKey() + " ");
				frequency--;
			}
		}
		System.out.print ("]");
	}
}
