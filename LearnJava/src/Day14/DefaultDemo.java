package Day14;

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student ob=new Student(); Student is of type default in package 14 
				// therefore STudent class can not be accessed outside the package
				ProtectedDemo ob=new ProtectedDemo();
				ob.phone="78946";
				
				Employee e=new Employee();
				e.designation="QA";
	}

}
