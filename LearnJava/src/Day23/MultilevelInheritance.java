/*
  create a class person with data member as name, age and methods inputperson() displayPerson()
  create a class Student with data member as marks and std and methods inputStudent() and displayStudent()
  create class GradStudent with data member as course and grade methods inputGrad() and displayGrad()
  
  Note: Student inherits from Person
  GradStudent inherits from Student
  
  
 */
package Day23;

class A
{
	int a=10;
	public void methodA()
	{
		System.out.println("A's Methods");
	}
}
class B extends A
{
	int b=20;
	public void methodB()
	{
		System.out.println("B's Method");
	}
}
class C extends B
{
	int c=a+b;
	public void methodC()
	{
		System.out.println("C's method");
		System.out.println(a+" "+b+" "+c);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob=new C();
		ob.methodA();
		ob.methodB();
		ob.methodC();
		
	}

}
