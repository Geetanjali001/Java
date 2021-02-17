package Day14;

public class MethodsReturnAValue {
	public static int findSquare(int a)
	{
		return a*a;
	}
	
	public static void findCube(int a)
	{
		System.out.println(a*a*a);
		//return a*a*a;
	}
	
	public void sum(int a)
	{
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodsReturnAValue ob=new MethodsReturnAValue();
				System.out.println(findSquare(5));  // method call
				findCube(5);// method call
			
	}
}	

	
	
