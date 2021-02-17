package com.qa.basics;

import java.util.Scanner;

public class AreaAndCircumfOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Enter radius of Circle");
        double pi=3.14;
        double r =sc.nextDouble();
        double area = pi* r*r;
        double Circumf= 2*pi*r;
        System.out.println("Area of circle: "+area);
        System.out.println("circumf: "+Circumf);
        
        
	}

}
