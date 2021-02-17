package Day23;
class Person
{
	int age;
	String name;
	
	public Person(int a,String n)
	{
		age=a;
		name=n;
		System.out.println("Paramerized constror of class Person");
	}
	public void display()
	{
		System.out.println(age+"\t"+name);
	}
}
class Student extends Person // if a parent class has parameterized constructor
							// it is compulsary to make p constructor in child
{
	String course;
	public Student(int a,String n,String c)
	{
		super(a,n);			// here super is used to call parent class constructor
		course=c;
	}
	public void display()
	{
		super.display();	// here it will call the parent class display method
		System.out.println(course);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob=new Student(10,"Misha","ComputerScience");
		ob.display();
	}

}
