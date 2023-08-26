//Using for loop to copy individual elements one by one

package com.ArrayCopy;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7};
		int[] copy = new int[original.length];
		for(int i = 0; i<original.length; i++) {
			copy[i] = original[i];
		}
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(copy));
		

	}

}
