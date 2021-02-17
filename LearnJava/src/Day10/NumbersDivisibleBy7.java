/* WAPto input an array of 10 integer elements and print the values which are divisible by 7.
 numbers (a)   7 14 21 22 24 35 42 26 30 49
         (i)   0  1  2  3  4  5  6  7  8  9
  output       *   *  *       *  *        *
 */ 
package Day10;

import java.util.Scanner;

public class NumbersDivisibleBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int [10];
		Scanner input= new Scanner (System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<10;i++) {
			a[i]=input.nextInt();	
		}
		System.out.println("Numbers which are divisible by 7: ");
		for(int i=0;i<10;i++) {
			if (a[i]%7==0)
				System.out.println(a[i]);
		}
		
		

	}

}
