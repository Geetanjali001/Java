/*
  find factorial of a no
  print factors of a number
  check no is even or odd
  check no is prime, armstrong, perfect
  print table of a no.
 */
package Day15;

import java.util.Scanner;

public class AreaOfTriangle {
	
public void calculateAreaOfTriangle(double b, double h ) {
	double cal=0.5*b*h;
	System.out.println("The are of triangle is: "+cal);
}

	public static void main(String[] args) {
		// TODO Auto-generated method s
		AreaOfTriangle ob=new AreaOfTriangle();
		//ob.calculateAreaOfTriangle(12.5, 20.0);
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter height and base of tringle");
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		ob.calculateAreaOfTriangle(b, h);

	}
	}


