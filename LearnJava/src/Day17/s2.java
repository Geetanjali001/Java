package Day17;

import java.util.Scanner;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno[]=new int[3];
		String name[]=new String[3];
		int age[]=new int[3];
		System.out.println("Enter rollno name and age for 3 students: ");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			rollno[i]=sc.nextInt();
			name[i]=sc.next();
			age[i]=sc.nextInt();
		}
		
		//code to display
		System.out.println("Student details are: ");
		for(int i=0;i<3;i++)
		{
			System.out.println(rollno[i]+"\t"+name[i]+"\t"+age[i]);
		}
	}

}
