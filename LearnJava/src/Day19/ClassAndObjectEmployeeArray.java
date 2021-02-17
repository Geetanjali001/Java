package Day19;

import java.util.Scanner;

class Emp
{
	int id;
	String ename;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id and ename");
		id=sc.nextInt();
		ename=sc.next();
	}
	public void display()
	{
		System.out.println(id+"\t"+ename);
	}
}
		
public class ClassAndObjectEmployeeArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp e[]=new Emp[3]; // e[0], e[1], e[2]
		
		for(int i=0;i<3;i++)
		{
			e[i]=new Emp(); // creating memory
			e[i].input();
		}
		
		System.out.println("Details are:");
		for(int i=0;i<3;i++)
		{
			e[i].display();
		}

	}
	}


