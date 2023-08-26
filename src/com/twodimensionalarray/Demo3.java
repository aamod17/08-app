//find out the transpose of a given matrix

package com.twodimensionalarray;

public class Demo3 {

	public static void main(String[] args) {
		
		int[][] a1 = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0; i<a1.length; i++) {
			for(int j = 0; j<a1[1].length; j++) {
				System.out.print(a1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Tranpose matrix");
		System.out.println();
		for(int i = 0; i<a1.length; i++) {
			for(int j = 0; j<a1[1].length; j++) {
				System.out.print(a1[j][i]+"\t");
			}
			System.out.println();
		}
		

	}

}
