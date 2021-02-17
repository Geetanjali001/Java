/*
 * Do the same for 5 employees using array. Take input from user
  Initialization of Instance variables through Method
 */
package Day18;

import java.util.Scanner;

class OpsEmployee
{
	int empId;	// instance var
	String name;// instance var
	double salary;
	String role;
	
	public void input(int empID, String Empname,double Empsal,String Emprole)
	{
		empId=empID;
		name=Empname;
		salary=Empsal;
		role=Emprole;
	}
	
	public void display()
	{
		System.out.println("Id: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Emp salary: "+salary);
	    System.out.println("Emp Designation: "+role);
	}
	 
}

public class InitializationThroughMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpsEmployee e1=new OpsEmployee();
		e1.input(01, "Richa", 10000, "QA");
		e1.display();
		
		OpsEmployee emp[]=new OpsEmployee[3];
		Scanner sc=new Scanner (System.in);
		
		for (int i=0;i<3;i++) {
			emp[i]=new OpsEmployee();
			System.out.println("Enter the employee information");
			int id = sc.nextInt();
			String n = sc.next();
			int Empsalary = sc.nextInt();
			String empdegn = sc.next();
			emp[i].input(id,n,Empsalary,empdegn);
		}
		for(int i=0;i<3;i++) {
			emp[i].display();
		}
		
	}

}
