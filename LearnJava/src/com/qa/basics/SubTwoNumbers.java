package com.qa.basics;

import java.util.Scanner;

public class SubTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter two numbers");
		
		double a =sc.nextDouble();
		double b =sc.nextDouble();
		double c = (a)-(b);
		System.out.println("Sub of two num is: "+c );
		
		
	}

}
