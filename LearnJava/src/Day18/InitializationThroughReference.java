/*
 * Do the same question for 5 students using array and take input from user
 */
package Day18;

import java.util.Scanner;

class Student
{
	int rollno;
	String name;
}
public class InitializationThroughReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(); // here s1 is a reference
		s1.rollno=1; // initialization through reference
		s1.name="Aashi"; // initialization through reference
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Abhinav";
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		
		Student s3=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno and Name");
		s3.rollno=sc.nextInt();
		s3.name=sc.next();
		System.out.println(s3.rollno);
		System.out.println(s3.name);
	}

}
