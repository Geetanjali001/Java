/*
 	WAP to input a number and check if it is pallindrome
 	Enter a Number: 121// first write the code to reverse the number and print the reverse output
 	Reverse: 121
 	if number is equal to its reverse then it is a Pallindrome Number
 */
package Day6;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter the Number");
int n=sc.nextInt();
int r;
int re=0;
int a=n;                      // Dry run
while (n!=0) {                //num=121       //num=12        //num=1
	r=n%10;                   //r=121%10=1    //r=12%10=2     //r=1%10=1
	re= re*10+r;              //re=0*10+1=1   //re=1*10+2=12  //re= 12*10+1=121
	n=n/10;                   //n=121/10=12   //n=12/10=1     //n=1/10=0
}
System.out.println("The reverse of given number is: "+re);
if (a==re)
	System.out.println("This as pallindrome number");
else
	System.out.println("This is not pallindrome number");

	}


}
