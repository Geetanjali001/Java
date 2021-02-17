/*
 		WAP to input an array of 10 integers elements and print elements present at even position
 		1	5	7	9	8	4	2	10	34	56
 index	0	1	2	3	4	5	6	7	8	9
 				*		*		*		*
 				i		i		i		i
 		elements present at even positions
 		7	8	2	34
 		
 		Assessment
 		1. WAP to input an integer array of 10 elements and print the elements present at odd positions
 		2. WAP to input an array of 10 integer elements and print the values which are divisible by 7.
 		3. WAP to ...... elements and print the values div by both 3 and 5.
 		4. WAP ......values divisible by 3 but not 5.
 */
package Day10;

import java.util.Scanner;

public class PrintEleOnEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[10]; // declare array length
Scanner sc=new Scanner (System.in);
System.out.println("Enter the numbers of array");
for (int i=0;i<10;i++) //run the loop until i value becomes 9
{
	a[i]=sc.nextInt(); //user input as per array  length
	}
System.out.println("Elements present at even positions: ");
	for(int i=2;i<10;i=i+2) // loop will execute until i value reaches at 9. i value is 2 and eveytime
		                     //when loop will execute, i value will increase by 2
	{
		System.out.println(a[i]); //print the a values which are stored in java as per the indexing of i
	}
	System.out.println("Elements present at even positions: ");
	for(int i=2;i<10;i++)// a nested for loop will execute until i value becomes 9. i value is 2
		                 // and will be incremented every time by 1 until conditions fail
	{
		if(i%2==0) // if i value is completely divided by 2 
			System.out.println(a[i]); //print the a[i] value 
	}
	}

}
