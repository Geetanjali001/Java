package Day15;

import java.util.Scanner;

public class PerfectNumNoRTandWithArgu {
	public void PrintPerfectNum (int a) {
		int sum=0;
		System.out.println("The factor of given numbers are: ");
		for (int i=1;i<=a;i++) {
			if (a%i==0)
				System.out.println(i+ " ");
			sum=sum+i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PerfectNumNoRTandWithArgu ob=new PerfectNumNoRTandWithArgu();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the num");
		int a=sc.nextInt();
		ob.PrintPerfectNum(a);
		
	}

}
