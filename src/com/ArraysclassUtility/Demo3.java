package com.ArraysclassUtility;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		/*
		int[] original = {10,20,30,40,50,60};
		int[] copy = Arrays.copyOf(original, original.length);
		System.out.println("Original Array: "+Arrays.toString(original));
        System.out.println("Copy Array: "+Arrays.toString(copy));
        */
		/*int[] original2 = {11,22,33,44,55,66,77,88};
		int[] copy2 = Arrays.copyOf(original2, 4);
		System.out.println("Original Array: "+Arrays.toString(original2));
        System.out.println("Copy Array: "+Arrays.toString(copy2));
        */
		/*int[] original3 = {11,34,1,2,3,55,5,6,7,45,33,13};
		int length = original3.length+3;
		int[] copy3 = Arrays.copyOf(original3, length);
		System.out.println("Original Array: "+Arrays.toString(original3));
        System.out.println("Copy Array: "+Arrays.toString(copy3));
		*/
		/*int[] original4 = {1,2,3,4,5,6,7,8,9,10};
		int[] copy4 = Arrays.copyOfRange(original4, 0, 6);
		System.out.println("Original: "+Arrays.toString(original4));
		System.out.println("Copy: "+Arrays.toString(copy4));
		*/
		/*int[] original5 = {11,22,13,44,14,15,16,17,18,19};
		int[] copy5 = Arrays.copyOfRange(original5, 0, original5.length);
		System.out.println("Original: "+Arrays.toString(original5));
		System.out.println("Copy: "+Arrays.toString(copy5));
		*/
		/*int[] original6 = {10,11,20,21,30,31,40,41,50,51};
		int[] copy6 = Arrays.copyOfRange(original6, 3, original6.length);
		System.out.println("Original: "+Arrays.toString(original6));
		System.out.println("Copy: "+Arrays.toString(copy6));
		*/
		/*int[] original7 = {31,32,33,34,35,36,37,38,39};
		int[] copy7 = Arrays.copyOfRange(original7, 3, 6);
		System.out.println("Original: "+Arrays.toString(original7));
		System.out.println("Copy: "+Arrays.toString(copy7));
		*/
		int[] original8 = {19,38,57,76,95,114,133,152,171,190};
		//int[] copy8 = Arrays.copyOfRange(original8,-3, 7);// java.lang.ArrayIndexOutOfBoundsException
		int[] copy8 = Arrays.copyOfRange(original8,11, 7);// java.lang.IllegalArgumentException
		System.out.println("Original: "+Arrays.toString(original8));
		System.out.println("Copy: "+Arrays.toString(copy8));
		
		
		
		
		
		
		
	}

}
