package com.array.program;

import java.util.Arrays;

public class Lab29ArrayElementRemoval {
	public static void main(String[] args) {
		String arr[]={"Zero", "One", "Two", "Three", "Four", "Five", "Six"};
		int index=2;
		
	}

	public static void removeAtIndex(int arr[], int index) {
		String[] arrayBeforeRemoval = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};
        
        System.out.println("Array Before Removal");
         
        System.out.println("=========================");
         
        System.out.println(Arrays.toString(arrayBeforeRemoval));
         
        System.out.println("========================");
         
        //Removing an element at index 2
         
        //String[] arrayAfterRemoval = ArrayUtils.remove(arrayBeforeRemoval, 2);
         
        System.out.println("Array After Removal");
         
        System.out.println("========================");
         
        //System.out.println(Arrays.toString(arrayAfterRemoval));
   // }

	}
}
