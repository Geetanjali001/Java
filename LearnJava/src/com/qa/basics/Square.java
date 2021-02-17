package com.qa.basics;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
        System.out.println("Enter side of a square");
        double s= sc.nextDouble();
        double a= s*s;
        double p= 4*s;
        System.out.println("area is: "+a);
        System.out.println("perimeter is: "+p);
    
	}

}
