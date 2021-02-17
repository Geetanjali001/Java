package Day16;

public class OverloadMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadMainMethod ob=new OverloadMainMethod();
		System.out.println("Main method with STring array");
		ob.main(10);
		main('c');
	}
	
	public void main(int a)
	{
		System.out.println("Main method with int variable");
	}
	
	public static void main(char a)
	{
		System.out.println("Main method with char variable");
	}

}
