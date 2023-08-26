package com.ArraysclassUtility;

import java.util.Arrays;

public class Demo5 {

	public static void main(String[] args) {
		
		/*int[] a1 = {11,12,13};
		Arrays.fill(a1, 77);
		System.out.println(Arrays.toString(a1));
		*/
		int[] a2 = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println("Original: "+Arrays.toString(a2));
		Arrays.fill(a2, 3, 6, 101);
		System.out.println("After calling fill(a2,3,6,101) method: "+Arrays.toString(a2));

	}

}
