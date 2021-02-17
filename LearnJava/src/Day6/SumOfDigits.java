/*
 	WAP to input a number and print sum of its digits
 	Enter a number: 123
 	sum of digits: 1+2+3= 6
 */
package Day6;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
        int n=sc.nextInt();   //n=135    //n=13  //n=1
        int r=0; 
        int sum=0;
        while (n!=0) {       //condition is true//n=13 is > 0 //n=1 is < 0
        	r=n%10;          //r=135%10=5  //r=13%10=3  //r=n%10=1
        	sum=sum+r;       //sum=0+5=5   //sum=5+3=8  //sum=8+1=9
        	n=n/10;          //n=135/10=13 //n=13/10=1  //n=1/10=0
        }
        System.out.println("The sum of the given digit is: "+sum);
	}

}
