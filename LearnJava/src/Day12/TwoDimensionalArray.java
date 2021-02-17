/*
 	 two types of array:
 	 1. One Dimensional Array:  1 row and multiple columns
 	 2. MultiDemensionalArray: more than 1 rows and coulmns
 	 
 	 How to declare multi-Demensional Array
 	 datatype arrname[][]= new datatype[row-size][column-size];
 	 
 	 example 
 	 int a[][]=new int[3][3];
 	 
 	 			col0	col1	col2
 	 row 0		45		56		12
 	 			00		01		02		--index
 	 -----------------------------------			
 	 row 1		0		0		1
 	 			10		11		12
 	 ------------------------------------			
 	 row 2		2		15		12
 	 			20		21		22
 	 -------------------------------------
 	 
 	 			value present at a[2][1]=15
 	 
 	 
 */

package Day12;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare two D array
				int a[][]=new int [3][3];
				
				// take input from user
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter elements in an array");
				for(int i=0;i<3;i++)			// i=0		1		2
				{
					for(int j=0;j<3;j++)		// j=0		1		2
					{
						a[i][j]=sc.nextInt();	//	12		52		45
												//	00		01		02
					}// enf of j loop
				}// end of i loop
				
				// Display elements
				System.out.println("Elements are: ");
				for(int i=0;i<3;i++)			// i=0		1		2
				{
					for(int j=0;j<3;j++)		// j=0	1	2
					{
						System.out.print(a[i][j]+"\t");	// 00	01	02  10	11	12 	20	21	22
					}
					System.out.println();
				}
				
	}

}
