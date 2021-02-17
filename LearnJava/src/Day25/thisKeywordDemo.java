/*
 * when local var and instance var has same name, we use this keyword with var name to refer instance var.
 * highlighted in blue color
 */
package Day25;
class Student
{
	int rollno;
	String name;
	
	public Student(int rollno, String name)
	{
		
		this.rollno=rollno;
		this.name=name;
		/*
		rollno=rollno;
		name=name;
		*/
	}
	public void display()
	{
		System.out.println(rollno+"\t"+name);
	}
}
public class thisKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"Misha");
		s.display();
	}

}
