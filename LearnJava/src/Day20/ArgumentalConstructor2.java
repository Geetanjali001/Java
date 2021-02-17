package Day20;

class Employee1{
	
	int EmpId;
	String EmpNa;
	double EmpSa;
	
	//Constructor
	
	public Employee1(int id,String name,double salary) {
		EmpId=id;
		EmpNa=name;
		EmpSa=salary;
		System.out.println("Object created");
		
	}
	public void Display() {
		System.out.println(EmpId+"\t" +EmpNa+ "\t"+ EmpSa);
	}
}


public class ArgumentalConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 Emp=new Employee1(01,"Misha",50000);
		Emp.Display();
	}

}
