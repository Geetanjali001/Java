/*
 	WAP to find the sum of numbers untill user press 0
 	1	3	5	0
 	sum:9
 */
package Day6;

import java.util.Scanner;

public class SumOfTheNumbersUntilUserInputZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
//int n=-1;
int sum=0;
while (n!=0) {
	sum=sum+n;
	n=sc.nextInt();
}
 System.out.println("The sum of the given numbers is: "+sum);
	} //end of main
} //end of class


