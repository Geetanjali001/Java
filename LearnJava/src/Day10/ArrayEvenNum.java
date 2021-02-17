//WAP to print the even numbers using array

//Array no. input be user 1 2 3 4 5 6 7 8 9 10
//indexing in java memory 0 1 2 3 4 5 6 7 8 9

package Day10;

import java.util.Scanner;

public class ArrayEvenNum {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];    //Declared array size is 10
		System.out.println("Enter elements in an array");
		for(int i=0;i<10;i++)  // run the loop, loop will execute 10 times to accept the user input
		{
			a[i]=sc.nextInt(); //Need a clerification from richa

		}
		
		System.out.println("Even numbers are: ");
		for(int i=0;i<10;i++)  //Loop will execute again until i is equals to 9
		{
			if(a[i]%2==0)  //so as per indexing in java if a value on 0 indexing is completely divided by 2
				           // or any a value as per java indexing divided by 2 then its a even number
				System.out.println(a[i]);
		}

	}

}
