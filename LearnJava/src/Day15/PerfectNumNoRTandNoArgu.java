package Day15;

import java.util.Scanner;

public class PerfectNumNoRTandNoArgu {
	public void PrintPerfectNum () {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the num");
		int a=sc.nextInt();
		int sum=0;
		System.out.println("The factors of given num are: ");
		for (int i=1;i<=a;i++) {
			if (a%i==0)
				System.out.println(i+" ");
			sum=sum+i;	
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumNoRTandNoArgu ob=new PerfectNumNoRTandNoArgu();
		ob.PrintPerfectNum();


	}

}
