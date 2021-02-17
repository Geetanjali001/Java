package Day14;

class Student
{
	private int rollno; // accessible with in the class
	String name; // default
	protected String phone;
	public String school;
	
	public void display()
	{
		System.out.println(rollno);
		System.out.println(phone); // accessible within the class
		System.out.println(school);
	}
} // End of class Student

public class PrivateAccessSpecifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob=new Student();
		// ob.rollno=2; error
		ob.name="Richa";
		ob.phone="4377797983";
		ob.school="graphic era";
		
		ProtectedDemo ob1=new ProtectedDemo();
		ob1.phone="456789";
		
	}

}
