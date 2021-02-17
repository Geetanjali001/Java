package Day5;

public class InterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("a: "+a); //The value of a will be printed as 10
		
		{ //loop started
			a=a+10;// the value of a stored in veriable a (which is 10) and the 
			//other value 10 will be added,the value of a after addition will become 20
			System.out.println("a= "+a); //the value of a will be printed as 20
			a++;// the value of a will be incremented by 1. now the value of a will be 21
		}
		System.out.println("a= "+a);//the value of a will be printed as 21

	}

}
