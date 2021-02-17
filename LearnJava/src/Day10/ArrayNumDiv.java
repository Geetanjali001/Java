//WAP in java to print only those numbers which are divisible by 3 but not by 5 or divided by only 5 but not 
//divided by 3 or print the numbers which are divisible by both 3 and 5

package Day10;

import java.util.Scanner;

public class ArrayNumDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int [10]; //declare array length and store in veritable "a"
Scanner sc=new Scanner (System.in); 
System.out.println("Enter the number of array");
for (int i=0; i<10;i++) //execute the loop until user input reaches its max limit which is less then 10
{
	a[i]=sc.nextInt();  //user input 
	}
//System.out.println("Numbers divisible by 3 but not 5");
//System.out.println("Numbers divisible by 5 but not 3");
System.out.println("Numbers divisible by 5 and 3");
	for(int i=0;i<10;i++) // execute the loop until i values reaches 9
	{
		//if(a[i]%3==0 && a[i]%5!=0) // as per indexing in java memory if a value of i (indexing 0 to 9 in java )
		                             //is completely divided by 3 but not by 5
		//if (a[i]%5==0 && a[i]%3 !=0)
		  if (a[i]%5==0 && a[i]%3==0)
		{
			System.out.println(a[i]); //Print only the numbers as per above condition 
		}
	}
	}

}
