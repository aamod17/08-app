package com.basic;

import com.beans.Employee;

public class Demo8 {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[6];
		emp[0] = new Employee("AAA", 111, "Banglore", 10000);
		emp[1] = new Employee("BBB", 222, "Delhi", 20000);
		emp[2] = new Employee("CCC", 333, "Hyderabad", 40000);
		emp[3] = new Employee("DDD", 444, "Chennai", 50000);
		emp[4] = new Employee("EEE", 555, "Banglore", 60000);
		emp[5] = new Employee("FFF", 666, "Banglore", 50000);
		System.out.println("Employee Details:");
		System.out.println("-------------------------");
		System.out.println("Name\tRollNo\tCity\tSalary");
		for(int i =0; i<emp.length; i++) {
			System.out.println(emp[i].name+"\t"+emp[i].rollNo+"\t"+emp[i].city+"\t"+emp[i].salary);
		}
		
		
		

	}

}
