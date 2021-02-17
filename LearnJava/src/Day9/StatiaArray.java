
// Declaration of an array
// datatype arrName[]=new datatype[array-size];
// int a[]=new int[50];
// float f[]=new float[10];
// char ch[]=new char[10];
// String names[]=new String[10];
// ASCII 
// A- 65       a-97
package Day9;

public class StatiaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaration and initialization of array
				//			0 1 2   3  4  5
				int a[]= {10,20,30,40,50,'a'}; // a will store the memory address of very first element
				System.out.println(a[5]);
				System.out.println(a); // [I@15db9742
				//				  0 		1	2	3
				String name[]= {"Richa","6754","9","a"};
				System.out.println(name[0]); // Richa
				char ch[]={'a','b','h','i'};
				//		  01234
				String s="Geeta";
				System.out.println(s.charAt(2));
				System.out.println(ch);
				System.out.println(s);

	}
	
	//Dynamic array memmory is at run time
	//Static Array memmory alocated at compilation time

}
