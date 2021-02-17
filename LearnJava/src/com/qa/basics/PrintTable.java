package com.qa.basics;

import java.util.Scanner;

public class PrintTable {

	public static void main (String []args) {
		
		/*Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
	    for (int i=1;i<=10;i++) {
	    System.out.println (num1 + "*" +i+ "=" + (num1*i));*/
	    
	    Scanner sc1=new Scanner (System.in);
	    System.out.println("Enter a number");
	    int a = sc1.nextInt();
	    for (int b=10;b>=1;b--) {
	    	System.out.println(a + "*" + b+ "=" +(a*b));
	    
	}
}
}

	



