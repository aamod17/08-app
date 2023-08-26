/*finds total marks and percentage of marks obtained by a student.
  Assume that the maximum mark in any subject is 100.
*/
package com.basic;

import java.util.Scanner;

import com.beans.Student;

public class Demo5 {

	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println("Enter Subject Marks:");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Math:");
		int math = scanner.nextInt();
		System.out.print("Hindi:");
		int hindi = scanner.nextInt();
		System.out.print("Sanskrit: ");
		int sanskrit = scanner.nextInt();
		System.out.print("English: ");
		int english = scanner.nextInt();
		System.out.print("Science: ");
		int science = scanner.nextInt();
		
		int[] inputmarks = {math,hindi,sanskrit,english,science};
		student.setMarks(inputmarks);
		student.getStudentDetails();
		scanner.close();
		
	}

}
