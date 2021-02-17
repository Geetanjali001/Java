
/*
 Assesment: WAP to input base and heigth of triangle and find its area
 input: base , height
 cal area= 0.5*base*height
 
 */package Day15;

import java.util.Scanner;

public class MethodwithoutRTwithArgument {
	public void areaOfSquare(double side)
	{
		double area=side*side;
		System.out.println("Area of square: "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodwithoutRTwithArgument ob=new MethodwithoutRTwithArgument();
		ob.areaOfSquare(55.2);//one way to print the are of square to provide a hard coded value (55.2)
		
		Scanner sc=new Scanner(System.in);//Another way is that a value is given by a user 
		System.out.println("Enter side of square");
		double s=sc.nextDouble();
		ob.areaOfSquare(s);

	}

}
