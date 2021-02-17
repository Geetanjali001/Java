package Day22;

import java.util.Scanner;

class Employee1{
	float salary;
	//float bonus;
	
	public void Input(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter salary ");
		salary=sc.nextFloat();
		//bonus=sc.nextFloat();
	}
	public void Display() {
		System.out.println("Salary: " +salary);
	}
}
class Programmer extends Employee1{
	float bonus=1000;
	float TS;
	public void display() {
		System.out.println("Bonus: "+bonus);
		System.out.println(TS);
	}
	
	public void Salcalculation() {
		TS=salary+bonus;
	}
}

public class SingleInheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer emp=new Programmer ();
		//Programmer p=new Programmer();
		emp.Input();
		emp.Display();
		emp.Salcalculation();
		emp.display();
		

	}

}
