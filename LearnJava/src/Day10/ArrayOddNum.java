//WAP in java to print the odd numbers using array

package Day10;

import java.util.Scanner;

public class ArrayOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[10]; //declare the array length and save in variable "a"
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the numbers of Array");
		
	    for (int i=0;i<10;i++) //execute the loop until user input reaches its max limit which is less then 10
	    {
	    	a[i]=sc.nextInt(); //user input
	    }
	    System.out.println("The odd numbers are: ");
	    for (int i=0;i<10;i++) // execute the loop until i value reaches 9
	    {
	    	if (a[i]% 2 !=0) //as per indexing in java memory if a value of i (indexing 0 to 9 in java )
            //is not completely divided by 2
	    		System.out.println(a[i]);// print only those numbers for above condition is true
	    }
	}

}
