//WAP to input a number and print its factors
/*
 6
 factors of 6: 1 2 3 6
 15
 factors of 15: 1 3 5 15
 */
package Day5;

import java.util.Scanner;

public class PrintFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("The factors of the given numbers are: ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n Not Factors: ");
		for (int i=1;i<=n;i++) {
			if(n%i!=0) {
				System.out.print(i+" ");
			}
		}
				

	}

}
