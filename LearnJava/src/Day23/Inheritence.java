
/*
  create a class person with data member as name, age and methods inputperson() displayPerson()
  create a class Student with data member as marks and std and methods inputStudent() and displayStudent()
  create class GradStudent with data member as course and grade methods inputGrad() and displayGrad()
  
  Note: Student inherits from Person
  GradStudent inherits from Student
 */
package Day23;

import java.io.InputStream;
	
	class Person{
		String name;
		int age;
		public void InputPerson() {
			name ="Misha";
			age= 18;
		}
		public void DisplayPerson()
		{
			System.out.println("The Name and age of the person is: "+name+ "\t"+age);
		}
	}
	class student extends Person{
		int studId;
		double studMarks;
		public void InputStudInfo()
		{
			studId=001;
			studMarks=95.5;
		}
		public void DisplayStudInfo()
		{
			System.out.println("The student Id and marks are: "+studId+ "\t"+studMarks);
		}
	}
	class GradStudent extends student{
		String course;
	    String grade;
	    public void InputStudGradInfo() {
	    	course ="ComScience";
	    	grade="A+";
	}
		public void DisplayGradStudentInfo() {
			System.out.println("The student grad info is: "+course+ "\t"+grade);
			}
		}
	public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradStudent  GR=new GradStudent();
		GR.InputPerson();
		GR.InputStudInfo();
		GR.InputStudGradInfo();
		GR.DisplayPerson();
		GR.DisplayStudInfo();
		GR.DisplayGradStudentInfo();

	}

}
