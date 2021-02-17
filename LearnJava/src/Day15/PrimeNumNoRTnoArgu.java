package Day15;

import java.util.Scanner;

public class PrimeNumNoRTnoArgu {
	public void PrimeNum () {
		//int a[]=new int[6];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a num");	
		int num=sc.nextInt();
		if (num%2==0)
			System.out.println("This is a prime num");
		else
		System.out.println("not a prime num");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumNoRTnoArgu ob=new PrimeNumNoRTnoArgu();
		ob.PrimeNum();

	}

}
