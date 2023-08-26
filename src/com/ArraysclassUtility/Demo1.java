//asList(T a) method

package com.ArraysclassUtility;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		String[] arrayString = {"Dhanbad","Ranchi","NewYork","Banglore","Patna"};
		List<String> stringList = Arrays.asList(arrayString);
		System.out.println(stringList);
		stringList.add("Hyderabad");// RE- UnsupportedException
		System.out.println(stringList);

	}

}
