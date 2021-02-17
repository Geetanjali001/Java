package Day15;

import java.util.Scanner;

public class FactorOfNumNoRTandWithArgu {
	public void FactorOfNum (int a) {
		for (int i=1;i<=a;i++) {
			if(a%i==0)
				System.out.print(i+ " ");
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorOfNumNoRTandWithArgu ob=new FactorOfNumNoRTandWithArgu();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		ob.FactorOfNum(a);

	}

}
