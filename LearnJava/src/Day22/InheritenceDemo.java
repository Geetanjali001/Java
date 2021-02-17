package Day22;

import java.util.Scanner;

class Person{
	int ID;
	String name;
	String role;
	double salary;

public void InputInfo() {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter empID, name, role and salary information");
	ID=sc.nextInt();
	name=sc.next();
	role=sc.next();
	salary=sc.nextDouble();
}
public void Display() {
	System.out.println(ID +"\t"+name+"\t"+role+"\t"+salary);
}
}
class Employee extends Person {	
}


public class InheritenceDemo 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.InputInfo();
		emp.Display();

	}

}


