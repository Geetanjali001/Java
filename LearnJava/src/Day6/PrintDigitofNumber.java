/*
 	WAP to input a number and print its Digits
 	ENter a number: 789
 	7
 	8
 	9
 */
package Day6;

import java.util.Scanner;

public class PrintDigitofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();          //n=133   n=13   n=1
		int r = 0;
		while (n!=0) {                 // Condition is true //Condition true //condition true
			r=n%10;                   // r=133%10=3  //r=13%3=3  //r=1%10=1
			System.out.println(r);    // output:3    //output=3  //output=1
			n=n/10;                   // n=133/10=13 // n=13/10=1//n=n/10=0
		}
		
		
		

	}

}
