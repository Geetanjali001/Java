package Day3;

import java.util.Scanner;

public class UpperLower2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a char");
		
		String s= sc.next();
		char ch= s.charAt(0);
		if (ch>=65 && ch <=90) {
			System.out.println("This is a upper case letter");
			
		}
		else {
			System.out.println("This is a lower case letter");
			
		}
	
		
		
	}

}
