package Day17;

/*
 * WAP to create a class Account with following deatils
 * Instance variable- accno, name and balance
 * Methods- openAccount(), display(), deposit(), withdraw(), checkBalance()
 */
import java.util.Scanner;

class A
{}

class B
{}

class C
{}

class Account
{
	int accno;
	double balance;
	String name;
	
	public void openAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter accpunt number, name and balance");
		accno=sc.nextInt();
		name=sc.next();
		balance=sc.nextDouble();
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Account no: "+accno);
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
	}
	
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter amount to be deposit");
		double amt=sc.nextDouble();
		balance=balance+amt;
		System.out.println("Balance after deposit: "+balance);
	}
	
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter amount to be withdraw");
		double amt=sc.nextDouble();
		if(balance-amt>=0)
		{
		balance=balance-amt;
		System.out.println("Balance after withdraw: "+balance);
		}
		else
			System.out.println("Sorry insufficient funds");
	}
	
	public void checkBalance()
	{
		System.out.println("Balance: "+balance);
	}
	
}

public class BankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create object
		Account ac=new Account();
		
		//opens account
		ac.openAccount();
		int ch;
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("ENter 1 to deposit an amt \n Enter 2 to withdraw \n Enter 3 to check balance \n Enter 4 to exit");
			ch=sc.nextInt();
			if(ch<=0 || ch>3)
			{
				System.out.println("Wrong choice program will exit");
				System.exit(0);
			}
			switch(ch)
			{
			case 1: ac.deposit();
					break;
			case 2: ac.withdraw();
					break;
			case 3: ac.checkBalance();
					break;
			case 4: System.exit(0);
			default:System.out.println("Invalid input");
			} // end of switch
				
		}while(ch<=3);// end of do while loop

	}// end of main

}// End of class
