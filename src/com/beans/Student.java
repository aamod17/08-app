package com.beans;

public class Student {
	
	private int[] marks;
	
	public int[] getMarks() {
		return marks;
	}
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	public void getStudentDetails() {
		
		int markslength = marks.length;
		int sum = 0;
		float percentageGot ;
		for(int i =0; i<markslength; i++) {
			sum = sum + marks[i];
		}
		percentageGot = (float)sum/500 *100;
				
				
		System.out.println("Total Marks Obtainend: "+sum);
		System.out.println("Percentage got: "+percentageGot);
	}
	
}
