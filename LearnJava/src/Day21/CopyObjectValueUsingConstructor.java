package Day21;
class Student1
{
	int rollno;
	String name;
	
	public Student1(int r, String n)
	{
		rollno=r;
		name=n;
		display();
	}
	
	// copy constructor
	public Student1(Student1 s)
	{
		rollno=s.rollno;
		name=s.name;
	}
	
	public void display()
	{
		System.out.println(rollno+"\t"+name);
	}
}

public class CopyObjectValueUsingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1 s1=new Student1(1,"Misha");
		
		/*Student1 s2=new Student1(s1); // calls copy constructor and both s1 and s2 have seperate memory
		System.out.println("S1");
		s1.display();
		System.out.println("S2");
		s2.display();
		
		s2.name="Richa";
		s2.rollno=2;
		System.out.println("S2 values are changed to 2 and Richa");
		
		System.out.println("S1");
		s1.display();
		System.out.println("S2");
		s2.display();
		
		
		Student1 s3=new Student1(3, "Hema");
		Student1 s4=s3;  // here s4 is also point to same memory which s3 is pointing
		System.out.println("s3");
		s3.display();
		System.out.println("S4");
		s4.display();
		System.out.println("Changing s4 values to 4 and Geeta");
		s4.rollno=4;
		s4.name="Geeta";
		System.out.println("s3");
		s3.display();
		System.out.println("S4");
		s4.display();*/
	}

}
