package Day15;

import java.util.Scanner;

public class EvenOddNumWithoutRTwithArguments {
	public void EvenAndOddNum (int a) {
		if (a%2==0)
			System.out.println("Even Number");
		else if 
		(a%2!=0)
			System.out.println("Odd Num");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddNumWithoutRTwithArguments ob=new EvenOddNumWithoutRTwithArguments();
		//ob.EvenAndOddNum(5);
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		ob.EvenAndOddNum(a);
		

	

	}

}
