package com.ArraysclassUtility;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		
		/*Object[] a1 = {1,2,3};
		Object[] a2 = {1,2,3};
		boolean status = Arrays.deepEquals(a1, a2);
        System.out.println(status);
       
        String[] s1 = {"A","B","C","D"};
        String[] s2 = {"A","B","C","D"};
        boolean status1 = Arrays.deepEquals(s1, s2);
        System.out.println(status1);
        */
		/*int[] array1 = {11,55,66,33,44,55};
		int[] array2 = {11,55,66,33,44,55};
		boolean status1 = Arrays.equals(array1, array2);
		System.out.println(status1);
		*/
		/*int[] array3 = {11,12,13,14,33,2,4,17,1,3};
		int[] array4 = {11,12,13,14,33,2,4,22,2,3};
		boolean status2 = Arrays.equals(array3, array4);
		System.out.println(status2);
		*/
		int[] array5 = {1,2,3,4,5};
		int[] array6 = {5,4,3,2,1};
		boolean status3 = Arrays.equals(array5, array6);
		System.out.println(status3);//false: Order must be same
		
	}

}
