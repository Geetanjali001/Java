package Day17;

import java.util.Scanner;

public class Flight {
	int fno;
	String fname;
	String source;
	String destination;
	
	public void inputFlightDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Flight no, name, src and destination");
		fno=sc.nextInt();
		fname=sc.next();
		source=sc.next();
		destination=sc.next();
	}
	
	public void display()
	{
		System.out.println("Details are: ");
		System.out.println(fno+" "+fname+" "+source+" "+destination);
	}

}
