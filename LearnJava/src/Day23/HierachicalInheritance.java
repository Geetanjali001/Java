package Day23;

class D
{
	int d=10;
	public void methodD()
	{
		System.out.println("Method D "+d);
	}
}

class E extends D
{
	int e=20;
	public void MethodE()
	{
		System.out.println("Method E "+e);
	}
}

class F extends D
{
	int f=30;
	public void methodF()
	{
		System.out.println("Method F "+f);
	}
}
public class HierachicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e=new E();
		e.methodD();
		e.MethodE();
		
		F ob=new F();
		ob.methodD();
		ob.methodF();
		
	}

}
