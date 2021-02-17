package com.qa.basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 
	 System.out.println("Enter two nunbers");
		int a= sc.nextInt();
		int b=sc.nextInt();
		int sum= a+b;
		System.out.println("sum of the numbers: "+sum);
	}

}
