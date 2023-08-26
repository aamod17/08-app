//clone() method

package com.ArrayCopy;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		
		int[] originalArray = {11,12,13,14,15};
		int[] copyArray = originalArray.clone();
		System.out.println("Original : "+Arrays.toString(originalArray));
		System.out.println("Copy : "+Arrays.toString(copyArray));
		 

	}

}
