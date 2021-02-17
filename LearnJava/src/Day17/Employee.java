package Day17;

import java.util.Scanner;

public class Employee {
	
	int id;
	String eName;
	int sal ;
	
	public void input () {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter employee id, name and salary");
		id=sc.nextInt();
		eName=sc.next();
		sal=sc.nextInt();
	}
	public void display () {
		System.out.println(id+ "\t"+eName+ "\t"+ sal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee();
		ob.input();
		ob.display();

	}

}
