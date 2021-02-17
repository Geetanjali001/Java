/*
 	WAP to represent real life Bank scenario
 	
 	WAP to input customer name, opening balance and account number from user
 	
 	Write Menu driven code for following options and handle them
 	
 	Enter 1 to deposit an amount
 	Enter 2 to withdraw the amount
 	Enter 3 to check balance
 	Enter 4 to exit
 	
 	logic
 	case 1: take the amount as input from the user and
 			increase the balance with this amount
 			for eg. balance = 10000
 			amount=2000
 			now balance=12000
 			
 	case 2: take the amount as input from the user and
 			decrease the balance with this amount
 			for example: bal=12000
 			amount=3000
 			now bal=9000
 			
 	case 3: display the balance
 	
 	case 4: code to exit
 	
 */

package Day7;

import java.util.Scanner;

public class BankingScenaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter customer name");
		String CName=sc.next();
		System.out.println("Enter Opening Balence");
		double Obalence=sc.nextDouble();
		System.out.println("Enter Account number");
		int ANum=sc.nextInt();
		int ch;
		double amount=0;
		
		do {
		System.out.println("Enter 1 to deposite the amount");
		System.out.println("Enter 2 to withdraw the amount");
		System.out.println(" Enter 3 to display the balence");
		System.out.println("Enter 4 to exit");
		System.out.println("Enter choice");
		ch=sc.nextInt();
		switch (ch) {
		case 1:System.out.println(" Enter amount to deposite");
		amount=sc.nextDouble();
		Obalence=Obalence+amount;
		System.out.println("The opening balence is: "+Obalence);
		break;
		case 2:System.out.println("Enter the amount to withdraw");
		amount=sc.nextDouble();
		Obalence=Obalence-amount;
		System.out.println("The opening balence is: "+Obalence);
		break;
		case 3: System.out.println("Opening balence: "+Obalence);
		break;
		case 4: System.exit(0);
		default: System.out.println("Invalid entry");}
		}while(ch<=4);
		}
	

	}

	
