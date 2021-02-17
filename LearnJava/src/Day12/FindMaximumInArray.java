/*
 	WAP to input an array of 10 integer elements and find the min element
 	
 	values		5	8	6	4	2	
 	index		0	1	2	3	4	
 	
 	max: 8
 	
 	logic
 	
 	assumed max= a[0]      // max = 5
 	rum loop for index i=1 to a.length
 	compare max with each array element
 	if(a[i]>max)		i=1
 		max= a[i]		max=8  */


package Day12;

import java.util.Scanner;

public class FindMaximumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
Scanner sc=new Scanner (System.in);
System.out.println("Enter elements of an array");
for (int i=0;i<a.length;i++){
	a[i]=sc.nextInt();
}
int max=a[0];
for (int i=1;i<a.length;i++) {
  if(a[i]>max)
	  max=a[i];
}
System.out.println("Maximum element of the array is: "+max);
	}

}
