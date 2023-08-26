//copyOf() method and copyOfRange() method

package com.ArrayCopy;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		
		/*int[] originalArray = {11,12,13,12,11,14,2,3};
		int[] copyArray = Arrays.copyOf(originalArray, originalArray.length);
		System.out.println("Original: "+Arrays.toString(originalArray));
		System.out.println("Copy: "+Arrays.toString(copyArray));
		*/
		
		int[] originalArray = {1,2,66,7,44,53,12,3,4,5};
		int[] copyArray = Arrays.copyOfRange(originalArray, 3, originalArray.length-2);
		System.out.println("Original: "+Arrays.toString(originalArray));
		System.out.println("Copy : "+Arrays.toString(copyArray));

	}

}
