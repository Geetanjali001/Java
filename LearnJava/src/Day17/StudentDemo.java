package Day17;

import java.util.Scanner;

public class StudentDemo {
	
	// instance variables
	int rollno;
	String name;
	int age;
	
	//methods
	public void input()
	{
		System.out.println("----------------Inside Input Method--------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter rollno name and age");
		rollno=sc.nextInt();
		name=sc.next();
		age=sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("--------------------Inside Display Method-------------");
		System.out.println(rollno+"\t"+name+"\t"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("-----------------------Main method started------------------------");
		StudentDemo ob=new StudentDemo();
		System.out.println("-----------------Object Created-----------------");
		ob.input();
		ob.display();
		*/
		StudentDemo s[]=new StudentDemo[3]; // creating an array of size 3
		for(int i=0;i<3;i++)
		{
			s[i]=new StudentDemo(); // creating objects
			s[i].input();
		}
		System.out.println("Student details are: ");
		for(int i=0;i<3;i++)
		{
			s[i].display();
		}
		
	}

}
