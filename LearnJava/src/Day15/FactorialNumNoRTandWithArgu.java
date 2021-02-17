package Day15;

import java.util.Scanner;

public class FactorialNumNoRTandWithArgu {
	
	public void FactorialNum(int a) {
		int b1=1;
		for (int i=1;i<=a;i++) {
		b1=b1*i;
		
	}
		System.out.println("Factorail is: "+b1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumNoRTandWithArgu ob=new FactorialNumNoRTandWithArgu();
		ob.FactorialNum(7);
		/*Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
			ob.FactorialNum(a);
		}*/

	}
}


