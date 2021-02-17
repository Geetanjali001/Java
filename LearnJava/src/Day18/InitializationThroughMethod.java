/*
 * Do the same for 5 employees using array. Take input from user
  Initialization of Instance variables through Method
 */
package Day18;

import java.util.Scanner;

class Employee
{
	int empId;	// instance var
	String name;	// instance var
	
	public void input(int id, String n)
	{
		empId=id;
		name=n;
	}
	
	public void display()
	{
		System.out.println("Id: "+empId);
		System.out.println("Name: "+name);
	}
}

public class InitializationThroughMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.input(101, "Richa");
		e1.display();
		
		//taking input From user
		Employee e2=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id and Name: ");
		int id=sc.nextInt();  // here var id can be same as which we created in method input or it can be different
		String na=sc.next();
		e2.input(id, na);
		e2.display();
	}

}
