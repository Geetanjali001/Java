package Day15;

import java.util.Scanner;

public class FactorialNumNoRTandNoArgu {
	public void FactorialNum () {
		int a=0;
		int b=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a num");
		a=sc.nextInt();
		for (int i=1;i<=a;i++) {
			b=b*i;
		}
		System.out.println("Factorial of the num is: "+b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumNoRTandNoArgu ob=new FactorialNumNoRTandNoArgu();
		ob.FactorialNum();

	}

}
