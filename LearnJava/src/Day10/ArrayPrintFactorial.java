/*
 		array values	5	7	3	2	1
 		index			0	1	2	3	4
 		factorials		factorial of 5 is 120 (5*4**3*2*1)
 */
package Day10;

import java.util.Scanner;

public class ArrayPrintFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [5];  // declare the array length
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the array numbers");
		
		for (int i=0;i<5;i++) // loop will execute until i value becomes 4
		{
			a[i]=sc.nextInt(); //user input
		}
		//int b=1;
		for (int i=0;i<5;i++) { //loop will execute until i value becomes 4
			int n=a[i]; //store the a[i] value in a new variable n. for example if a value is 5
			            // and this value is stored in java memory at indexing 3 (i value is 3),store this
			            //value "5" of indexing i "3" in new declared variable "n"
			int b=1; // create a new variable b to store the results
			for (int j=1;j<=n;j++) { // run the loop again so here is the login
				                     //n=5
				                     // j=1 and j is less then n, condition is true, execute the next line
				                     
				b=b*j;// b=1,
			}
			System.out.println("Factorial: "+b);
			}
			
		}

	}


