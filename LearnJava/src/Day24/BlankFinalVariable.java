// static var, static and final, inheritance and final static
package Day24;

class Employee
{
	String name;
	final String SIN;
	
	public Employee()
	{
		SIN="12345"; // blank final var can be initialized through constructor only
		name="Geeta";
	}
	
}
public class BlankFinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee();
		ob.name="Richa";
		ob.SIN="6789"; //cannot modify final var value
	}

}
