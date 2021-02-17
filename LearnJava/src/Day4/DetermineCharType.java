package Day4;

import java.util.Scanner;

public class DetermineCharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a char");
		 char ch= sc.next().charAt(0);
		System.out.println(ch); 
		if (ch>='A'&& ch<='Z')
		System.out.println("Captital char");
		else if ( ch >='a'&& ch <='z')
		System.out.println("Lower char");
		else if(ch == '!' || ch=='@' || ch =='#' || ch=='$')
			System.out.println("Special symbol");
		else  if(Character.isDigit(ch)== true)
			System.out.println("Digit");
		
			

	}

}
