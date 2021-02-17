package Day23;

class J
{
	int j=10;
	public J()
	{
		System.out.println("Constructor of class J");
	}
	public void methodJ()
	{
		System.out.println("method J "+j);
	}
}
class K extends J
{
	int k=20;
	public K()
	{
		System.out.println("Constructor of K");
	}
	public void methodK()
	{
		System.out.println("Method K "+k);
	}
}

public class ConstructorsAndInheritanceInSinglelevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K ob=new K(); // constructor is automatically called when object is created
					// here first parent class constructor J is called then
					// child class constructor K is called
		ob.methodJ();
		ob.methodK();
	}

}
