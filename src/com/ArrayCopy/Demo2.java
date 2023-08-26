//System class arraycopy(---) method

package com.ArrayCopy;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		
		int[] originalArray = {11,12,13,14,15,9,3,2,87,11,2,3,5,12,13};
		int[] copyArray = new int[originalArray.length];
		
		System.arraycopy(originalArray,0 , copyArray, 0, originalArray.length);
		System.out.println(Arrays.toString(copyArray));
		

	}

}
