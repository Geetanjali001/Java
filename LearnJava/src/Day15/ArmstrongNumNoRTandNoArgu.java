/*
 logic								     r
 	Step 1: take each digit of a number: 3			5					1
 	Step 2: find cube of each digit:	 3*3*3=27	5*5*5=125		1*1*1=1
 	Step 3: sum all digits cube:		 27 + 125 + 1= 153
 */
package Day15;

import java.util.Scanner;

public class ArmstrongNumNoRTandNoArgu {
	public void PrintArmstrongNum () {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		//int num=0;
		int rem=0;
		int cube=0;
		int sum=0;
		int a=num;
		while (num!=0) {
			rem=num%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			num=num/10;		
		}
		System.out.println("The sum of the armstrong num is: "+sum);
		if (sum==a)
			System.out.println("This is a armstrong num");
		else
			System.out.println("This is not a armstrong num");	
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumNoRTandNoArgu ob=new ArmstrongNumNoRTandNoArgu();
		ob.PrintArmstrongNum();
		

	}

}
