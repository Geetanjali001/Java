
/*
 	WAP to input the id, name and salary of 3 employees and display them
 */
package Day9;

import java.util.Scanner;

public class EmployeeDataUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int id[]=new int [3];
		String Name []=new String[3];
		double Salery []=new double [3];
		
		for (int i=0;i<3;i++) {
			System.out.println("Enter Id, Name and Salery of the employee");
			id[i]=sc.nextInt();
			Name[i]=sc.next();
			Salery[i]=sc.nextDouble();
		}
		System.out.println("Employee details are:");
		System.out.println(" Employee ID \t Emp Name \t Emp Salery");
		for (int i=0;i<3;i++) {
			System.out.println(id[i]+ "\t\t" +Name[i]+ "\t\t " +Salery[i]+"\t");
			
		}
		//System.out.println(id[i]+ "\t" +Name+ "\t" +Salery+"\t");

	}

}
