package Day16;

public class MethodOverloadByTypeOfarg {

	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(double a,double b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadByTypeOfarg ob=new MethodOverloadByTypeOfarg();
		ob.sum(10, 20);
		ob.sum(55.26, 45.27);

	}

}
