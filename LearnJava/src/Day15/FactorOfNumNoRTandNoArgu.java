package Day15;

import java.util.Scanner;

public class FactorOfNumNoRTandNoArgu {
	public void FactorOfNum () {
		int n=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			if (n%i==0)
				System.out.print(i+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorOfNumNoRTandNoArgu ob= new FactorOfNumNoRTandNoArgu();
		ob.FactorOfNum();
	}

}
