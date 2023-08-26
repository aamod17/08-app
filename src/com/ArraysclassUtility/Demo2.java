package com.ArraysclassUtility;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		
		/*int[] number = {11,12,13,14,15,16,17,21,22,23,34,35};
		int index1 = Arrays.binarySearch(number, 34);//returns the index of 34
		int index2 = Arrays.binarySearch(number, 13);
		System.out.println(index1);
		System.out.println(index2);
		int index3 = Arrays.binarySearch(number, 20);//20 is not present returns -ve value. i.e. (-(insertion point)-1)
		System.out.println(index3);
		int index4 = Arrays.binarySearch(number, 36);
		System.out.println(index4);
		*/
		/*int[] number1 = {11,11,11,11,12,13,13,13,13,14,15};
		int index5 = Arrays.binarySearch(number1, 13);
        System.out.println(index5);
        */
		/*int[] number2 = {11,12,13,14,15,16,17,18,19,20};
		int index6 = Arrays.binarySearch(number2, 0, 5, 15);//searches between the index 0 to (5-1)
		System.out.println(index6);
		int index7 = Arrays.binarySearch(number2, 0, 5, 19);//searches between the index 0 to (5-1) or returns (-(insertion point) - 1)
		System.out.println(index7);
		*/
		int[] number3 = {10,11,9,8,16,12,11,23,5,4,2,23,12};// If it is not sorted, the results are undefined
		int index8 = Arrays.binarySearch(number3, 8);
		System.out.println(index8);
		//now sort it first
		Arrays.sort(number3);
		for(int x : number3) {
			System.out.print(x+" ");
		}
		System.out.println();
	    String s = Arrays.toString(number3);
	    System.out.println(s);
		int index9 = Arrays.binarySearch(number3, 4);
		System.out.println(index9);
		
	}

}
