package com.qa.basics;

import java.util.Scanner;

public class MultiplyTwoNum {

	public static void main (String[]args) {
		
		/*Scanner sc=new Scanner (System.in);
		System.out.println("Enter first number");
		int a= sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int c= a*b;
		System.out.println("The answer of multiplication is: "+c);*/
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First number");
		float i=sc.nextFloat();
		System.out.println("Enter Second number");
		float j=sc.nextFloat();
		float k=i*j;
		System.out.println("The answer of multiplication is: " +k);
	}
}
