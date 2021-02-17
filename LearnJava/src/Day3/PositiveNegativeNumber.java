package Day3;

import java.util.Scanner;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		if (a>0) {
			System.out.println("This is a positive number");
		}
		else 
		{
		System.out.println("This is a negative number");
		}

	}

}
