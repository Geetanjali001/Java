// MethodOverloading- Method with the same name but different Argument
package Day16;

public class MethodOverloading {
	
	public void sum(int a,int b) // M1  // here int a,int b are called Fofrmal Argumebts
	{
		System.out.println(a+b);
	}
	
	public void sum(int a,int b, int c) // M2
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ob=new MethodOverloading();
		
		ob.sum(10, 20);  // calls M1   // 10, 20 are actual arguments
		ob.sum(10, 20,30); // M2
	}

}
