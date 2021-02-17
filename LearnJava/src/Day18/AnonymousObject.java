package Day18;

class Square
{
	public void findsquare(int n)
	{
		System.out.println(n*n);
	}
	public void display()
	{
		System.out.println("Display method");
	}
}
public class AnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create Anonymous object and call its method
		new Square().findsquare(5); // this object will die once this line is executed
		
		/*
		Square s=new Square();
		s.findsquare(6);
		s.display();
		*/
	}

}
