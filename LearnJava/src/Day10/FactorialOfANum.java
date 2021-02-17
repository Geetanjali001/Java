
//WAP to input a number and find its factorial 
/*
 		Enter a number:
 		5
 		factorial: 120
 		
 		logic (how to calculate factorial)
 		5: 5*4*3*2*1
 			20*3*2*1
 			60*2*1
 			120*1
 			120
 		   i i i i i
 		5: 1*2*3*4*5
 			2*3*4*5
 			6*4*5
 			24*5
 			120
 			
 			i=1.....5
 			b=1;		b*i
 			b=b*i;  	1*1=1
 						1*2=2
 						2*3=6
 						6*4=24
 						24*5=120
 						
 	factorial of 7		1*1=1
 						1*2=2
 						2*3=6
 						6*4=24
 						24*5=120
 						120*6=720
 						720*7=5040
 */
package Day10;

import java.util.Scanner;

public class FactorialOfANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=1;
				
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		 
		int a=sc.nextInt();  // user input number is 5
		//for (int i=1;i<=a;i++) // i=1, i < 5= condition true
		for (int i=a;i>=1;i--)	 // i=2, i<5= condition true
			                   // i=3, i<5= condition true
			                   // i=4, i<5= condition true
			                   // i=5, i<=5 = condition true

		{
			b=b*i; // b=1, i=1, 1*1=1
			       // b=1, i=2, 1*2=2
			       // b=2, i=3, 2*3=6
			       // b=6, i=4, 6*4=24
			       // b=24, i=5,24*5=120
		}
		System.out.println("Factorial: "+b);
	}

}
