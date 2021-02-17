/*
 	WAP to input a Number and check if it is Armstrong Number
 	Enter a number: 153
 	
 	logic								 r
 	Step 1: take each digit of a number: 3			5					1
 	Step 2: find cube of each digit:	 3*3*3=27	5*5*5=125		1*1*1=1
 	Step 3: sum all digits cube:		 27 + 125 + 1= 153
 */

package Day6;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int r;
		int c=0;
		int sum=0;
		int a=n;
		while (n!=0) {
			r=n%10; //153%10=3, 15%10=5, 1%10=1
			c=r*r*r;// c=3*3*3=27, 5*5*5=125, c=1*1*1*=1
			sum=sum+c;//sum=0+27=27, sum=27+125=152, sum=27+125+1=153
			n=n/10;//153/10=15, 15/10=1,1/10=1
			//System.out.println("The sum of the digit of cube is: "+sum);
		}
		System.out.println("The sum of the digit of cube is: "+sum);
		if (sum==a)
			System.out.println("This a Armsrtong number");
		else 
			System.out.println("Not the Armstrong number");

	}

}
