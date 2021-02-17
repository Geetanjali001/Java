/*AP to input 3x3 matrix and find the sum of Right Diagonal elements
 	                 //right diagonal numbers in matrix
 	
 	1	2	3	     1
 	4	5	6        5  
 	0	0	1        1
 	
 	index of Right diagonal 00 + 11 + 22  // numbers are at same row and column index
 							ij	 ij	  ij
 							
 				if(i==j)
 					sum=sum+a[i][j];
 					
 	find sum of left diagonal 
 	index		02 + 11 + 20
 	            ij   ij   ij
 	0+2=2
 	1+1=2
 	2+0=2
 	
 	if(i+j==2)
 		sum=sum+a[i][j];
 */

package Day13;

import java.util.Scanner;

public class SumOfRightDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[][] =new int [3][3];         //Declare the length of array      
		  Scanner sc=new Scanner (System.in);
		  System.out.println("Enter the elements of the array");
		  for (int i=0;i<a.length;i++) {  // loop will run until i value is less then array length (loop for row)
			                              //means loop will run until i value become 2 since array length is 3
			  for(int j=0;j<a[i].length;j++) {//Loop will run until j value becomes less the a[i]length 
				  a[i][j]=sc.nextInt();//user input for i and j
			  }
		  }
		  System.out.println("The sum of right diagonal elements is: ");
		  int sum=0;
		  for (int i=0;i<a.length;i++) {
			  for (int j=0;j<a[i].length;j++) {
				  if(i==j)
					  sum=sum+a[i][j];
					  	  
			  }
		  }
		  System.out.println(+sum);
	}

}
