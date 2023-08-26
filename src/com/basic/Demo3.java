package com.basic;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		System.out.println("Addition of Numbers:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter "+a.length+" integer values:");
		
		for(int i = 0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		System.out.println("Your provided Numbers are :");
		for(int i : a) {
			System.out.println(i);
		}
		int sum= 0;
		for(int i = 0; i<a.length; i++) {
			sum = sum+ a[i];
		}
		System.out.println("Sum = "+sum);
        scanner.close();
	}

}
