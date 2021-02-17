/*
 		Data Type
 		char
 		int
 	 	float 
 	 	double
 */
package Day16;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=97;
		char ch=(char) a;  // converting int into char
		System.out.println(ch);
		
		char ch2='A';
		int b=ch2; // converting char to int
		System.out.println(b);
		
		int i=12;
		float f=i;
		
		float p=12.34f;
		int c=(int) p;

	}

}
