package com.qa.basics;

import java.util.Scanner;

public class SimpleInterestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter primary loan");
		double p=sc.nextDouble();
		System.out.println("Enter rate");
		double r=sc.nextDouble();
		System.out.println("Enter time");
		double t=sc.nextDouble();
        double SI = (p*r*t)/100;
        double amount = p+SI;
        
        System.out.println("Simple Interest is: "+SI);
        System.out.println("amount to be paid: "+amount);
	}

}
