package Day19;

class Employee{
	int empNo;
	String empNa;
	
	//Constructor 
	public Employee() {
		empNo=10;
		empNa="Rishi";
	}
public void Display() {
	System.out.println(empNo+ "\t"+ empNa);
}
}
public class EmployeeDemoByConstructor {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee();
		ob.Display();
		
		

	}

}
