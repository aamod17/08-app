package com.basic;

public class Demo1 {

	public static void main(String[] args) {
		
		int[] x = new int[4];
		x[0]= 12;
		x[1]=11;
		x[2]= 11;
		x[3]= 44;
		/*for(int x1: x) {
			System.out.println(x1);
		}*/
		
		int[] x3 = {11,12,12,23,44};
		//we can print values by using for() loop also.
		/*for(int i=0; i<x3.length; i++) {
			System.out.println(x3[i]);
		}*/
		//but it recommended that we should use for-each loop.
		for(int i: x3) {
			System.out.print(i);
		}
		
		
		int[][] y5= {{2,4,5,1},{44,55,66}};
		int[][][] z4 = {{{11,11,23},{12,45,3}},{{21,55,6},{1,2,3},{45}},{{222}}};
		Runnable[] r = new Runnable[11];
		
		int []x1;
		int x2[];
		
		//x = new int[2];
		
		int[][] y = new int[3][];
		
		int [][]y1;
		int y2[][];
		int[] []y3;
		int[] y4[];
		
		int[][][] z;
		int [][][]z1;
		int z3[][][];

	}

}
