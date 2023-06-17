package com.array.program;

import java.util.HashMap;
import java.util.Map;

public class Lab11countOccurrencesOfEachElementInAnArray {
	public static void main(String[] args) {
		int arr[] = { 891, 187, 891, 187, 891, 476, 555, 741 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if (map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

}
