//WAP to print below pattern
     //*
   // * *
  // * * *
 // * * * *
// * * * * *
//* * * * * *

package Day8;

public class PyramidPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1;i<=6;i++) {  //i loop will run until 6 time, first for loop condition will apply to print number of given rows
	//System.out.println();       //Dry run//veriable=i,j,k
	for (int j=5;j>=i;j--) {     //i=condition is true until i is equal to 6
	System.out.print(" ");       //j=5,condition is true until j is less then 1 (means j is 0)J for loop will
	                             // keepp printing the space until condition becomes false in this loop
}//end of j                      //k for loop will print the * if its condition is true, if condition is false 
	                             //then it will come out of the loop and looping will start again with i loop
	for (int k=1;k<=i;k++) {
		System.out.print(" *");
	}//end of k
	System.out.println();
	}//end of i
/*for (int i=5;i>0;i--) {
	//System.out.println();
	for (int j=5;j>=i;j++) {
	System.out.print(" ");
	
}//end of j
	for (int k=1;k<=i;k++) {
		System.out.print(" *");
}
	*/System.out.println();
	

	}
	}
//}

