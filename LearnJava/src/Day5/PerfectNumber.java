/*
 	WAP to input a number and check if it is perfect number
 	Enter a number: 6
 	logic for perfect number: sum of its factors(excluding number itself)= number
 	factors of 6: 1	+ 2 +  3= 6
 	sum of factors = number
 	6 = 6 T perfect number
 	F Not a Perfect number
 */
package Day5;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("The factors of the given number are:");
		int sum=0;
		for (int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(i+ " ");
				sum=sum+i;
			}
			
		}
		System.out.println("Sum of the factors of given number is: "+sum);
		if(sum==n)
			System.out.println("This is a natural number");
		else 
			System.out.println("Not a natural number");
		

	}//end of main

}//end of class

