//important concept
package com.basic;

class Student{
    String name;
	int rollNo;
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	

	
}

public class Demo4 {

	public static void main(String[] args) {
		
		Student[] student = new Student[5];
		student[0] = new Student("AAA", 101);
		student[1] = new Student("BBB", 102);
		student[2] = new Student("CCC", 103);
		student[3] = new Student("DDD", 104);
		student[4] = new Student("EEE", 105);
		System.out.println("Student Details:");
		System.out.println("-----------------");
		for(Student s : student) {// here s is acting like a object reference variable, so we can call the properties on it 
			System.out.println("Name: "+s.name+"\t"+"RollNo: "+s.rollNo);
		}
	   
		

	}

}
