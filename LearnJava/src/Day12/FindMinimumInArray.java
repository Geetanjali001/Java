/*
 	WAP to input an array of 10 integer elements and find the min element
 	
 	values		5	8	6	4	2	1
 	index		0	1	2	3	4	5
 	
 	min: 1
 	
 	logic
 	
 	assumed min= a[0]      // min = 5
 	rum loop for index i=1 to a.length
 	compare min with each array element
 	if(a[i]<min)		i=1
 		min= a[i]		min=4   2   1
 */
package Day12;

import java.util.Scanner;

public class FindMinimumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
Scanner sc=new Scanner (System.in);
System.out.println("Enter the elements of array");
for(int i=0;i<a.length;i++) { //loop will execute until i value become 4
	a[i]=sc.nextInt(); //user can enter 5 values as per array length
}
int min=a[0];// create a variable "min" and store the value as a[0], currently a value is 5 as per the indexing above
for(int i=1;i<a.length;i++) { //loop will run until i value reaches 4
	                          //i=1,C.true
	if(a[i]<min)              //min=5, as per 1 indexing a[i] is 8 which is not <5 as stored currently in min
		                     //therefore condition is false and the a[i] which 8 will not store in min 
		                     //and will not print, loop will run again, i value will increase and become 2
		                     // java will again check the condition until it becomes true and will print the min saved in min variable
		min=a[i];
}
System.out.println("The minimum element is: "+min);
	}

}
