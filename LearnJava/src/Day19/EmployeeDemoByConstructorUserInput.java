package Day19;

import java.util.Scanner;

class Employee1{
	int empNo;
	String empNa;
	
	//Constructor 
	public Employee1() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the employee empId, EmpName");
		empNo=sc.nextInt();
		empNa=sc.next();
	}
public void Display() {
	System.out.println(empNo+ "\t"+ empNa);
}
}
public class EmployeeDemoByConstructorUserInput {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 ob=new Employee1();
		ob.Display();
		
		

	}

}
