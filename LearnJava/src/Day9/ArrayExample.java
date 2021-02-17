//WAP to input roll number name marks of 5 students
package Day9;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		//Declare the roll number, Name and marks array

		int rollnumber[]=new int[5];
		String name []=new String[5];
		double marks[]=new double [5];
		System.out.println("Array Lingth: "+rollnumber.length);
		System.out.println("Array Lingth: "+name.length);
		System.out.println("Array Lingth: "+marks.length);
		
		//Take input from user
		for (int i=0;i<5;i++) {
			System.out.println("Enter rollenumber, name nad marks");
			rollnumber [i]=sc.nextInt();
			name [i]=sc.next();
			marks [i]=sc.nextDouble();
			
		}
		System.out.println("Employee details are: ");
		System.out.println("rollnumber \tname \tmarks" );
		for (int i=0;i<5;i++) {
			System.out.println(rollnumber[i]+ "\t"    +name[i]+ "\t"   +marks[i] );
		}
		
	}

}
