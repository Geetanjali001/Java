package Day3;
import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Age");
		int a= sc.nextInt();
		if (a>=18) {
			System.out.println("eligible to vote");
		}
		else 
			System.out.println("No eligible to vote");
		
	}

}
