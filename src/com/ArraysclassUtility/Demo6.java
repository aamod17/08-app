package com.ArraysclassUtility;

import java.util.Arrays;

public class Demo6 {

	public static void main(String[] args) {
		
		/*int[] a1 = {32,31,29,28,34,77,101,9,5,19,3,2};
		System.out.println("Original : "+Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println("After calling sort() method: "+Arrays.toString(a1));
        */
		
		int[] a2 = {19,2,199,23,55,12,11,8,9,109,33,67,87};
		System.out.println("Original: "+Arrays.toString(a2));
		Arrays.sort(a2, 3, 8);
		System.out.println(Arrays.toString(a2));
		
		
	}

}
