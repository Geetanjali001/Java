package Day15;

import java.util.Scanner;

public class PrimeNumNoRTwithArgu {
	public void PrimeNum (int num) {
		
		if (num%2==0) 
			System.out.println("This is a prime number");
		else 
			System.out.println("This is not a prime number ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumNoRTwithArgu ob=new PrimeNumNoRTwithArgu();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		ob.PrimeNum(num);
	

	}

}
