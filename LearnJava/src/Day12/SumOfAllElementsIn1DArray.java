/*
 *WAP to input integer elements in 1D Array and find the sum of all elements
 *         Col:0(j)  Col:1(j)   Col:2(j)
  row(0)(a)   2         4          6       3     1
  index (i)   00        01         02      03    04
  ________________________________________________
   sum  =  16
 
 */

 

package Day12;

import java.util.Scanner;

public class SumOfAllElementsIn1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int a[]=new int [5];
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter elements of Array");
			for (int i=0;i<a.length;i++) {  //user input loop will execute until i value become 4
				a[i]=sc.nextInt();	
			}
			
	//System.out.println("The sum of all the elements of one D array is: ");
	int sum=0;
	for(int i=0;i<a.length;i++) {//i=0,C.true, i=1, C.True,i=2, C.True,i=3, C.True,i=4, C.True
		                         //i=5, C.false, Come out of the loop
		sum=sum+a[i];  // sum=0, a[i]=2; 0+2=2; sum=2  (i=0)
		               // sum=2, a[i]=4; 2+4=6; sum=6  (i=1)
		               // sum=6, a[i]=6; 6+6=12;sum=12 (i=2)
		               // sum=12,a[i]=3; 12+3=15;sum=15(i=3)
		               //  sum=15, a[i]=1; 15+1=16; sum=16(i=4)
	}
	System.out.println("The sum of all the elements of one D array is: "+sum);

	}

}
