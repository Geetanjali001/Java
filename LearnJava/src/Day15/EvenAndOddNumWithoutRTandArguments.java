/*
 * WAP to print even and odd numbers without return type and without providing arguments
 */

package Day15;

import java.util.Scanner;

public class EvenAndOddNumWithoutRTandArguments {
	
	public void EvenOddNum() {
		int a=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		if(a%2==0)
			System.out.println("Number is even: " +a);
		else if
		(a%2!=0)
			System.out.println("number is odd: " +a);
		
	}
		/*int a[]=new int[5];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the numbers");
		//int i=0;
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
		}
		System.out.println("The even numbes are");
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				System.out.println(+a[i]);
			//else 
				//System.out.println("The numbers are odd");
		}
		//else 
			//System.out.println("The numbers are odd");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenAndOddNumWithoutRTandArguments ob=new EvenAndOddNumWithoutRTandArguments();
		ob.EvenOddNum();

	}

}
