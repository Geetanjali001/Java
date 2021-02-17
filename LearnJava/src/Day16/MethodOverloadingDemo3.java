package Day16;

public class MethodOverloadingDemo3 {
	
	public void sum(String a, String b)
	{
		System.out.println(a+b);
	}
	
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo3 ob=new MethodOverloadingDemo3();
		ob.sum("Richa", "Mittal");
		ob.sum(10, 20);
	}

}
