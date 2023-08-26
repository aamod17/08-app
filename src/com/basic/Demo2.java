package com.basic;

class ArrayData{
	int[] a = new int[4];
	
	String[] s1 = new String[4];
	
	public ArrayData() {
		for(int i=0; i<a.length; i++) {
			System.out.println("Value of instance primitive valriable: "+a[i]);
		}
		System.out.println();
		for(int j=0; j<s1.length; j++) {
			System.out.println("Reference variable of String array :"+s1[j]);
		}
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
		boolean[] b = new boolean[3];
		for(int i=0; i<b.length; i++) {
			System.out.println("Value of local primitive variable: "+b[i]);
		}
		System.out.println();
		
		int[] c = new int[4];
		for(int i=0; i<c.length; i++) {
			System.out.println("Value of local primitive variable(int type): "+c[i]);
		}
		System.out.println();
		String[] s = new String[4];
		for(int i=0; i<s.length; i++) {
			System.out.println("Value of reference local variable(String): "+s[i]);
		}
		System.out.println();
		new ArrayData();

	}

}
