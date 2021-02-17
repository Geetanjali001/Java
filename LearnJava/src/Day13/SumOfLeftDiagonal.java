/*AP to input 3x3 matrix and find the sum of Right Diagonal elements
 	                 //light diagonal numbers in matrix
 					
 	1	2	3	     3
 	4	5	6        5  
 	0	0	1        0
 	
 	sum of left diagonal is =8
 	
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

public class SumOfLeftDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][]=new int [3][3];
        Scanner sc=new Scanner (System.in);
        System.out.println(" Enter the elements of an array");
        for (int i=0;i<a.length;i++) {
        	for (int j=0;j<a[i].length;j++) {
        		a[i][j]=sc.nextInt();
        	}
        }
        System.out.println("The sum of left diagonal is");
        int sum=0;
        for (int i=0;i<a.length;i++) {
        	for (int j=0;j<a[i].length;j++) {
        		if (i+j==2)
        			sum=sum+a[i][j];
        		
        	}
        	//System.out.println(+sum);
        }
        System.out.println(+sum);
	}

}
