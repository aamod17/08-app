//Passing arrays to methods in Java

package com.basic;

public class Demo6 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5};
		m1(x);

	}
	
	public static void m1(int[] y) {
		
		for(int i = 0; i<y.length; i++) {
			System.out.print(y[i]+" ");
		}
		
	}

}
