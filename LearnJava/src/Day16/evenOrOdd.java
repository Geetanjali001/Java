package Day16;

import java.util.Scanner;

public class evenOrOdd {
	public int EvenAndOdd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int a=sc.nextInt();
		
		if(a%2==0)
			return 0;
		else 
			return 1;
		
	}
	
	//i can hear you

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOrOdd ob=new evenOrOdd();
				int r=ob.EvenAndOdd();
		if(r==0)
			System.out.println("Even");
		if(r==1)
			System.out.println("Odd");

	}

}
