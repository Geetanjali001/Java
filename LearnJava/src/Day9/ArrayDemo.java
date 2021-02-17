
/*
 		WAP to input rollno name marks of 5 students
 		-- over all you need 150 variables
 		Better solu - Arrays
 		3 different arrays- rollno[], name[], marks[]
 		 Array size: 50
 */package Day9;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		//Declare rollnumber, name, marks array
		int rollnum[]=new int[5];
		String name[]=new String[5];
		double marks[]=new double[5];
		//Take input from user
		System.out.println("Enter rollnumber,Name and Marks");
		rollnum[0]=sc.nextInt();
		name[0]=sc.next();
		marks[0]=sc.nextDouble();
		System.out.println("Enter rollnumber,Name and Marks");
		rollnum[1]=sc.nextInt();
		name[1]=sc.next();
		marks[1]=sc.nextDouble();
		System.out.println("Enter rollnumber,Name and Marks");
		rollnum[2]=sc.nextInt();
		name[2]=sc.next();
		marks[2]=sc.nextDouble();
		System.out.println("Enter rollnumber,Name and Marks");
		rollnum[3]=sc.nextInt();
		name[3]=sc.next();
		marks[3]=sc.nextDouble();
		System.out.println("Enter rollnumber,Name and Marks");
		rollnum[4]=sc.nextInt();
		name[4]=sc.next();
		marks[4]=sc.nextDouble();
		
		

	}

}
