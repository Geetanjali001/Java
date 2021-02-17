/*
 When one abstract class inherits another abstract class, then there is no rule to override the parent class abstract method
 */
/*
 * if a class has more than 1 abstract method child class has to override all the abstract methods
 * or if you don't want to override then make child class also an abstract class
 */

package Day25;

abstract class A
{
	abstract public void printData();
}
abstract class B extends A 
{
	abstract public void display();
}
class C extends B
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printData() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InheritanceInAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
