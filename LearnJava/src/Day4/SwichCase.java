package Day4;

import java.util.Scanner;

public class SwichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println(" Enter number");
		int d=sc.nextInt();
		switch (d) {
		case 1: System.out.println(" Monday");
		break;
		case 2: System.out.println(" Tues");
		break;
		case 3: System.out.println("Wed");
		break;
		case 4: System.out.println("Thrus");
		break;
		case 5: System.out.println("Fri");
		break;
		case 6: System.out.println("Sat");
		break;
		case 7: System.out.println("Sun");
		break;
		default: System.out.println("Invalid number");
		
		
		
	
		
		}
		
		
		

	}

}
