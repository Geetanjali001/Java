package Day20;

import java.util.Scanner;

class Employee{
	
	int EmpId;
	String EmpNa;
	double EmpSa;
	
	//Constructor
	
	public Employee(int id,String name,double salary) {
		EmpId=id;
		EmpNa=name;
		EmpSa=salary;
		System.out.println("Object created");
		
	}
	public void Display() {
		System.out.println(EmpId+"\t" +EmpNa+ "\t"+ EmpSa);
	}
}
public class ArgumentalConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter employee info");
		int id=sc.nextInt();
		String name=sc.next();
		double sal=sc.nextDouble();
		Employee emp1=new Employee(id,name,sal);
		Employee Emp=new Employee(01,"Misha",50000);
		Emp.Display();
		emp1.Display();
	}

}
