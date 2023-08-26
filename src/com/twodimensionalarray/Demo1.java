//create a 2D array and display its elements in the matrix form.

package com.twodimensionalarray;

public class Demo1 {

	public static void main(String[] args) {
		/*
		int[][] a = new int[2][3];
		a[0][0] = 12;
		a[0][1] = 13;
		a[0][2] = 56;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		
		System.out.println(a.length);//length of base array
		System.out.println(a[1].length);//length of first branch 
		
		//int[][] a= {{12,13,56},{40,50,60}};
		 
		for(int i = 0; i<2; i++) {
			for(int j= 0; j<3; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		
		//int[][] a1 = new int[3][3];
		//System.out.println(a1.length);
		//System.out.println(a1[1].length);
		int[][] a1 = {{1,2,3},{4,5,6},{7,8,9}};
		
        for(int i = 0; i<a1.length; i++) {
        	for(int j =0; j< a1[1].length; j++) {
        		System.out.print(a1[i][j]+"\t");
        	}
        	System.out.println();
        }

		

	}

}
