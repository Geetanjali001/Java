/*
 	WAP to input a number and print its Reverse
 	Enter a number: 145
 	Reverse: 541
 */

package Day6;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number");
int n=sc.nextInt();    //n=135  //n=13  //n=1
int r=0;
int rev=0;
while (n!=0) {        // condition is true //Condition is true  condition is true
	r=n%10;           // r=135%10=5     // r=13%10=3  //r=1%10=1
	rev=rev*10+r;     // rev=rev*10+5=5 //rev=5*10+3=53  //rev=53*10+1=531
	n=n/10;           // n=135/10=13    //n=13/10=1      //n=1/10=0
	
}
System.out.println(rev);

	}

}
