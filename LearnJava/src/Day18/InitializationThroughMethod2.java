/*
 * Do the same for 5 employees using array. Take input from user
  Initialization of Instance variables through Method
 */
package Day18;

import java.util.Scanner;

class Emp1
{
	int empId;	// instance var
	String name;	// instance var
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id and Name: ");
		int id=sc.nextInt();  
		String na=sc.next();
		empId=id;
		name=na;
	}
	
	public void display()
	{
		System.out.println("Id: "+empId);
		System.out.println("Name: "+name);
	}
}

public class InitializationThroughMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 e1=new Emp1();
		e1.input();
		e1.display();
		
		//taking input From user
		Emp1 e2=new Emp1();
		
		e2.input();
		e2.display();
	}

}
