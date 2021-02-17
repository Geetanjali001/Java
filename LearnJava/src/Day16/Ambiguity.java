package Day16;

public class Ambiguity {
	
	public static void sum(int a,long b){System.out.println("a method invoked");}  
	public static void sum(long a,int b){System.out.println("b method invoked");}  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(20,34689);
	}

}
