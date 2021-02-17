/*WAP to input integer elements in 2D array and print sum of the columns
   2DArray Elements
            Col:0(j)  Col:1(j)   Col:2(j)
  row(0)(i)   2         4          6  
  -----------00--------01----------02
  row(2)(i)   4         5          7
  -----------10---------11---------12
  row(3)(i)   3         8          4 
  ----------- 20--------21-------- 22
  _________________________________________________
   sum        9         17         17
 */

package Day12;

import java.util.Scanner;

public class SumOfColumnElementsIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for (int i=0;i<3;i++) {     //i loop will execute until i value becomes 2
			for (int j=0;j<3;j++) { //j loop will execute until j value becomes 2
			a[i][j]=sc.nextInt();   // user input for i and j
		}
	}
		System.out.println("Sum of each row elements is: ");
		
   for (int i=0;i<3;i++) {
	    int sum=0;                   // i=0:condition true, i loop will execute until i value becomes 2
	   for (int j=0;j<3;j++) {//j=0: condition true, j=1: condition true, j=2: condition true
		                      //j=3, Condition false, come out of j loop and print sum of the first row
		   sum=sum+a[j][i];// sum=0, j=2: 0+2, sum=2||j=4: 2+4, sum=6||j=6: 6+6=12
		   //System.out.print(a[i][j]);
		   
	   }
	   System.out.println("sum of column " + (i+1) + " is : "+sum);
	   //print the sum of each row(i)
   } 
   
	}

}
