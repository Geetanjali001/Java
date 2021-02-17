package Day24;
class Shape
{
	public void area()
	{
		System.out.println("Calculate area");
	}
}

class Circle extends Shape
{
	double r=5.3;
	final double PI=3.14;
	
	public void area() // this area() overides the parent area()
	{
		double a=PI*r*r;
		super.area();	//this is use to call parent class area()
		System.out.println("Area of circle: "+a);
	}
}

class Triangle extends Shape
{
	double b=12,h=23;
	
	public void area()
	{
		System.out.println("Area of triangle= "+(0.5*b*h));
	}
}
public class MethodOverriddingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.area();
		
		Triangle t=new Triangle();
		t.area();
	}

}
