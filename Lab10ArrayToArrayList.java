package com.array.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab10ArrayToArrayList {
	public static void main(String[] args) {
		String[] array = new String[] { "ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF" };
		usingAsList(array);
		usingAsList(array);
		usingListAddAll(array);
		usingJava8(array);
		ArrayListToArray();
	}

	public static void usingAsList(String arr[]) {
		List list = Arrays.asList(arr);
		System.out.println(list);
	}

	public void usingCollectionsAddAll(String arr[]) {
		ArrayList<String> al = new ArrayList<>();
		Collections.addAll(al, arr);
		System.out.println(al);
	}

	public static void usingListAddAll(String arr[]) {
		ArrayList<String> al = new ArrayList<>();
		al.addAll(Arrays.asList(arr));
		System.out.println(al);
	}

	public static void usingJava8(String arr[]) {
		List list = Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(list);
	}
	public static void ArrayListToArray() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("JSP");
		list.add("ANDROID");
		list.add("STRUTS");
		list.add("HADOOP");
		list.add("JSF");
		String[] array = new String[list.size()];
		list.toArray(array);
		for (String string : array) {
			System.out.println(string);
		}
	}

}
