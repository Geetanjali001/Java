package com.qa.basics;

import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter length and width");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area is: "+area);
        int p= 2*(l+b);
        System.out.println("Perimeter: "+p);
        
	}

}
