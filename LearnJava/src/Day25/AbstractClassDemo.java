package Day25;
abstract class Shape
{
	public Shape()
	{
		System.out.println("Shape class Constructor");
	}
	abstract public void area(); // abstract
	public void draw()  // non abstract method
	{
		System.out.println("Drawing shape");
	}
}
class Triangle extends Shape // as child class extends abstract class Shape, it has to override its abstract method area()
{
	double b,h;
	@Override
	public void area() {
		b=78;
		h=67;
		// TODO Auto-generated method stub
		System.out.println("Area of triangle : "+(0.5*b*h));
	}
	
}
class Square extends Shape
{
	double s;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		s=9;
		System.out.println("Area of square: "+(s*s));
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s=new Shape(); give compile time error as cannot create object of Abstract type
		Triangle t=new Triangle(); // Shape class constructor will be invoke
		t.area();
		Square s=new Square(); // shape class constructor will be invoked
		s.area();
		
		Shape ob; // creating the reference of class Shape
		ob=new Triangle(); // giving memory by making use of new keyword. shape class constructor will be invoked
		ob.area();
		ob=new Square(); //shape class constructor will be invoked
		ob.area();
		
		//WebDriver driver=new ChromeDriver();
		
	}

}
