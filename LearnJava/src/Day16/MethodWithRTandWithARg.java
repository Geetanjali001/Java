package Day16;

import java.util.Scanner;

public class MethodWithRTandWithARg {
	
	public double simpleInterest(double p, double r, int t) // Formal arg
	{
		return (p*r*t)/100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithRTandWithARg ob=new MethodWithRTandWithARg();
		
		double si=ob.simpleInterest(15000, 12.25, 5); // Actual arg
		System.out.println(si);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p r and t");
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		int t=sc.nextInt();
		
		si=ob.simpleInterest(p, r, t); // Actual
		System.out.println(si);
	}

}
