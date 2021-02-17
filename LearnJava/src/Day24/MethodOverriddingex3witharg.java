package Day24;
class C
{
	public void m1(int a)
	{
		System.out.println("Method 1 of base class with arg"+a);
	}
}
class D extends C
{
	public void m1(int p)
	{
		System.out.println("Method 1 of child class with arg"+p);
	}
}
public class MethodOverriddingex3witharg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D ob=new D();
		ob.m1(10);
	}

}
