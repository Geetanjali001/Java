
/*
 	 If we have parameterizes constructor in the program
 	 and we want to create object like following without argument
 	 Then it is compulsary to create default constructor 
 	 Student s1=new Student();
 */
package Day21;
 class Student2
 {
 	int rollno;
 	String name;
 	
 	public Student2()
 	{
 		
 	}
 	public Student2(int r, String n)
 	{
 		rollno=r;
 		name=n;
 	}	
 	public void display()
 	{
 		System.out.println(rollno+"\t"+name);
 	}
 	}

public class CopyObjectValuesWithoutConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2(1,"Misha");
		s1.display();
		
		Student2 s2=new Student2();
		s2.display();
		
		//s2=s1; // s2 will point to same memory where s1 is pointing
		s2.rollno=s1.rollno;
		s2.name=s1.name;
		s2.display();
		
		System.out.println("S2 values got changed");
		s2.rollno=2;
		s2.name="Geeta";
		System.out.println("S1 and S2");
		s1.display();
		s2.display();

	}

}
