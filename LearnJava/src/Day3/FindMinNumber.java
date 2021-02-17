package Day3;

import java.util.Scanner;

public class FindMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		if (a<b) {
			System.out.println(a+ "lower num");
		}
		else {
			System.out.println(b+ "lower num");
		}
		

	}

}
