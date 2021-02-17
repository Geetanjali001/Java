package Day4;

import java.util.Scanner;

public class QuadraticRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d;
		System.out.println("Enetera b and c: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		d=Math.pow(((b*b)-(4*a*c)), 1.0/2);
		System.out.println("d: "+d);
		if(d<0)
			System.out.println("No solution");
		else if(d==0)
		{
			System.out.println("There is only one solution");
			double x=-b/(2*a);
			System.out.println("x= "+x);
		}
		else if(d>0)
		{
		double r1=(-b+d)/(2*a);
		System.out.println("r1= "+r1);
		double r2=(-b-d)/(2*a);
		System.out.println("r2: "+r2);
		}
	}

}
