package Day4;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Find out if a char a vowel or consonant
		Scanner sc=new Scanner (System.in);
		System.out.println(" Enter a char");
		 char ch= sc.next().charAt(0);
		  
		 switch (ch) {
		 case 'a':
		 case 'e':
		 case 'i':
		 case 'o':
		 case 'u':
		 case 'A':
		 case 'E':
		 case 'I': 
		 case 'O':
		 case 'U':
			 System.out.println("This is a Vowel");
			 break;
			 default: System.out.println("This is a Consodent");
		 }
		 
		
	}

}
