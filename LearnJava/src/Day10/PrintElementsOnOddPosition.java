/*
 		WAP to input an array of 10 integers elements and print elements present at odd position
 		1	5	7	9	8	4	2	10	34	56
 index	0	1	2	3	4	5	6	7	8	9
 			*		*		*		*	    *
 			i		i		i		i	    i
 		elements present at even positions
 		5	9	4	10  56*/

package Day10;

import java.util.Scanner;

public class PrintElementsOnOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [10];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the array elements");
		for (int i=0;i<10;i++) {
        a[i]=sc.nextInt();
	}
		System.out.println("Elements which are present at odd positions");
		for (int i=1;i<10;i=i+2) {
			if(i%2!=0)
			System.out.println(a[i]);
		}
		/*System.out.println("Elements which are present at odd positions are");
		for (int i=1;i<10;i++) {
			if(i%2!=0)
				System.out.println(a[i]);*/
		}
	}


