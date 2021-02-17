
//WAP to print the prime number in an array
/*
 		5	9	7	4	2	1
 		o	1	2	3	4	5
 		
 */

package Day10;

import java.util.Scanner;

public class ArrayPrintPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of array");
		for (int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();  // 5	9	10	3	2	7
		}
		//System.out.println("Prime numbers: ");
		System.out.println("Prime numbers are: ");
		for (int i=0; i<6;i++)
		{
			//int n=a[i];		// n=5
			int c=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0) // or if(n%j==0)
					c++;
			}// end of j loop
			if(c==2)
				System.out.println(a[i]);  // 5
		}
	}

}
