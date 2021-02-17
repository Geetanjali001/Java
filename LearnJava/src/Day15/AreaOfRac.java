package Day15;

import java.util.Scanner;

public class AreaOfRac {
	
	public void CalulateArea() {
		int l=0;
		int b=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the values");
		l=sc.nextInt();
		b=sc.nextInt();
		int res=l*b;
		System.out.println("results is: "+res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRac ob=new AreaOfRac();
		ob.CalulateArea();

	}

}
