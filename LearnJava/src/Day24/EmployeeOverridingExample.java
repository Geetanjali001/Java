package Day24;

class Employee1{
	int EmpId;
	String EmpName;
public void InputEmployeeInfo() {
	EmpId=001;
	EmpName= "Tanisha";
}
public void DisplayEmployeeInfo() {
	System.out.println("Employee ID and name is: "+EmpId+"\t"+EmpName);
}
}
class EmployeeRecord extends Employee1 {
	int EmpCode;
	String EmpFullname;
	String EmpDesignation;
	Double Empsal;
	String EmpAddress;	
	public void InputEmpRecord() {
		EmpCode=46574;
		EmpFullname="Jai Bhatia";
		EmpDesignation="Project manager";
		Empsal=(double) 50000;
		EmpAddress="1508-chares street";	
	}
	public void DisplayEmployeeInfo() {
		super.DisplayEmployeeInfo();
		System.out.print("The employee record info is: "+EmpCode+"\t"+EmpFullname+"\t"+EmpDesignation+"\t"+Empsal+"\t"+EmpAddress);
	}
}
public class EmployeeOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRecord emp=new EmployeeRecord();
		emp.InputEmployeeInfo();
		emp.InputEmpRecord();
		emp.DisplayEmployeeInfo();
		//emp.DisplayEmprecord();
	}

}
