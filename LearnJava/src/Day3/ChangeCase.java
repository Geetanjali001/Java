package Day3;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a char");
		String s= sc.next();
		char ch=s.charAt(0);
		if (ch>=65 && ch <=90) {
		ch =(char) (ch+32);
		}
		else {
			ch=(char) (ch-32);
			
		}
		System.out.println("case "+ch);
		
		
	}

}
