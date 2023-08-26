//demonstrate the difference between passing an entire array and passing array element of primitive data type to a method.

package com.basic;

public class Demo7 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println("original array");
		for(int a1: a) {
			System.out.print(a1+" ");
		}
		System.out.println();
		System.out.println("original element at a[3] = "+a[3]);
		m1(a[3]);
		System.out.println("After calling method");
		System.out.println("a[3] = "+a[3]);
		System.out.println("modified array");
		m1(a);
		for(int a1: a) {
			System.out.print(a1+" ");
		}
		System.out.println();
		
		

	}
	public static void m1(int[] a) {
		
		for(int i = 0; i<a.length; i++) {
			a[i] = a[i]*2;
			//System.out.print(a[i]+"\t");
		}
	}
	public static void m1(int arrayelement) {//here i am passing array element, so it is behaving like primitive
		int x = arrayelement;
		x= x*5;
	}

}
