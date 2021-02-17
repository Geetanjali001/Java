package Day19;

import java.util.Scanner;

class Student{
	int sRollNo;
	String sName;
	String sEmail;
	String sAddress;
	double sGrade;	

public void InputSudentInfo() {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter sudent information");
	sRollNo=sc.nextInt();
	sName=sc.next();
	sEmail=sc.next();
	//sEmail+=Student.nextLine();
	sAddress=sc.next();
	sAddress+=sc.nextLine(); 
	sGrade=sc.nextDouble();
}
public void DisplayStudentInfo() {
	System.out.println(sRollNo+ "\t"+ sName+ "\t"+sAddress +"\t"+ sGrade );
}
}
public class ClassAndObjectStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S[]=new Student[3];
		for (int i=0;i<3;i++) {
			S[i]=new Student();
			S[i].InputSudentInfo();
		}
		System.out.println("Student Detail are: ");
		for (int i=0;i<3;i++) {
			S[i].DisplayStudentInfo();
		}
	}

}
