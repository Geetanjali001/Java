package Day16;

import java.util.Scanner;

public class MethodwithRTandwitoutArg {
	
	public int sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a+b;
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodwithRTandwitoutArg ob=new MethodwithRTandwitoutArg();
		System.out.println(ob.sum());
		
		int s=ob.sum();
		System.out.println("SUm: "+s);
	}

}
