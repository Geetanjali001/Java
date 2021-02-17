/*
 WAP to input a number and print its table
 enter a number 7
 n * i = n*i
 sout(n+" * "+i+" = "+n*i)
 7 * 1 =7
 7 * 2 = 14
 .
 .
 .
 7 * 10 = 70
 */
package Day5;

import java.util.Scanner;

public class PrintATable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
//for (int i=1;i<=10;i++) {
for (int i=10;i>=1;i--) {
	System.out.println(n+ "*" +i+ "="+n*i);
}
	}//end of main

}//end of class
