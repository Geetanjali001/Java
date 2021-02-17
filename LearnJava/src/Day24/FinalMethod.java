package Day24;

class A
{
	public void m1()
	{
		System.out.println("Method 1 of base class");
	}
	public final void m2()
	{
		System.out.println("Method 2 of base class");
	}
}

class B extends A
{
	public void m1()
	{
		System.out.println("Method 1 of child class");
	}
	
	//public void m2() // child class cannot override final method of parent class
	/*{
		System.out.println("Method 2 of child class");
	}*/
}

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		ob.m1();
		ob.m2();
	}

}
