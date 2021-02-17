//WAP to calculate the sum of elements in an Array
// HW: WAP to input 1D Array and find the sum of all elements

package Day12;

import java.util.Scanner;

public class SumOfElementsIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int [2][2];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the elements of the array");
		for (int i=0;i<a.length;i++) {
	     for (int j=0;j<a[i].length;j++) {
	    	 a[i][j]=sc.nextInt();
	     }	
		}
		
		int sum=0;						// 1				4			8
		for (int i=0;i<2;i++) {			// i=0		1
		     for (int j=0;j<2;j++) {	// j=0		1
		    	 sum=sum+a[i][j];		// sum=sum+a[0][0], sum+a[0][1], sum+a[1][0], sum+a[1][1]
		     }
			}
		System.out.println("Sum of all elements: "+sum);

	}

}
