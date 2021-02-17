package Day24;

class Person
{
	String name;
	int age;
	
	public void input()
	{
		name="Misha";
		age=18;
	}
	public void display()
	{
		System.out.println(name+"\t"+age);
	}
	
}
class Student extends Person
{
	String course;
	
	public void inputStudent()
	{
		course="CS";
	}
	public void display()  // here both parent and child class have same method with same arg it is known as method Overridding
	{
		super.display();	// super is use to call parent class method
		System.out.println(course);
	}
}

public class MethodOverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob=new Student();
		ob.input();
		ob.inputStudent();
		ob.display();
	}

}
