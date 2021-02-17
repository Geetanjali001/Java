package Day4;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and marks of 5 subjects");
		String name=sc.nextLine();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int ave= (a+b+c+d+e)/5;
		String grade=null;
		System.out.println("name: "+name);
		if (ave>=85)
			grade="A+";
		else if (ave>=70 && ave<85)
			grade="A";
		else if (ave>=60 && ave<70)
			grade="B";
		else if (ave>=50 && ave <60)
			grade ="C";
		else if ( ave>=40 && ave <50)
			grade = "D";
		else 
			grade="Fail";
		System.out.println("Grade: "+grade+"\n Avg: "+ave);
			
			
			
			
		

	}

}
