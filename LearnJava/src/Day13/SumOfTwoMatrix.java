/*    Substract two matrix
 *			A				B					C
 		1	0	1		1	1	2			2	1	2
 		2	1	1		2	2	0			4	3	1
 		0	0	2		5	0	1			5	0	3
 		
 		c[i][j]= a[i][j]+b[i][j];
 		
 		find sum of two no
 		1. input a   // excellent
 		2. input b	// excellent
 		3 c=a+b     // test your logic
 		4. print c
 		
 		output : 2  1  3
 		         4  3  1
 		         5  0  3
 */

package Day13;

import java.util.Scanner;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int [3][3]; //Declare the size of array matrix "a"
		int b[][]=new int [3][3]; // Declare the size of array matrix "b"
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the elements of a matrix");
		//Matrix a user input
		for (int i=0;i<a.length;i++) {  //loop will run until i value is less then array row length
			                            //array row length is 3,means i loop will be executing until i value becomes 2
			for (int j=0;j<a[i].length;j++) { ///loop will run until j value is less then array column length
                //array column length is 3,means j loop will be executing until j value becomes 2
				a[i][j]=sc.nextInt();//User input for i and j 
			}
		}
		//Matrix b user input
		System.out.println("Enter the elements of a matrix");
		for (int i=0;i<b.length;i++) {
			for (int j=0;j<b[i].length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The sum of elements of Matrix a and b is: ");
		int c[][]=new int [3][3];//declare the array length for c matrix where the sum of 2 matrix will be stored 
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]= a[i][j]+b[i][j];// add the logic to sum the value of both matrix 
				System.out.print(c[i][j]+"\t");//Print the sum 
			}
			System.out.println();
		}
		
	}

}
