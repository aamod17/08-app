// create a Java program to calculate the sum of all elements by columns and the sum of all elements in the 2D array.

package com.twodimensionalarray;

public class Demo2 {

	public static void main(String[] args) {
		
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int totalsum = 0;
		
		int rowsum = 0;
		for(int i =0; i<a.length; i++) {
			for(int j = 0; j<a[1].length; j++) {
				System.out.print(a[i][j]+"\t");
				totalsum = totalsum+a[i][j];
				
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Total sum = "+totalsum);
		
		for(int i =0; i<a.length; i++) {
			for(int j = 0; j<a[1].length; j++) {
				//System.out.print(a[i][j]+"\t");
				rowsum = rowsum+a[i][j];
				
			}
			//System.out.println();
			System.out.println("total sum of row elements at "+i+" place = "+rowsum);
			rowsum = 0;
		}
		for(int j = 0; j<a[1].length; j++) {
			int columnsum = 0;
			for(int i = 0; i<a.length; i++) {
				
				columnsum = columnsum + a[i][j];
				
			}
			//System.out.println();
			System.out.println("Total sum of column elements at "+j+" place = "+columnsum);
		}

	}

}
