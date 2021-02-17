/*
 WAP to input a number and check if it is prime number or not
 
 Enter a number
 7
 
 n=7
 			c=0
 7%1==0 T	1
 7%2==0 F
 7%3==0 F
 7%4==0 F
 7%5==0 F
 7%6==0 F
 7%7==0 T	2
 
 if c==2
 Prime Number
 else
 Not a prime Number
 
 */

package Day5;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean flag=true;
		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
  if(flag==true)
	  System.out.println("This is a prime number");
  else
	  System.out.println("Not a prime number");
	}

}
