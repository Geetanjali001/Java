package Day17;
import java.util.Scanner;

public class Customer {
	
	String cname;
	String address;
	
	public void inputCustomerDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter name and address");
		cname=sc.next();
		address=sc.next();
	}
	
	public void display()
	{
		System.out.println(cname+" "+address);
	}

}
