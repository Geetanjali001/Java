// Design a calculator

package Day7;

import java.util.Scanner;

public class CalculatorUsingDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
//int ch;
//int result=0;

int ch;
int result=0;
do {
	System.out.println("Enter 1 for addition");
	System.out.println("Enter 2 for subtraction");
	System.out.println("Enter 3 for multiplication");
	System.out.println("Enter 4 for division");
	System.out.println("Enter 5 to exit the program");
	System.out.println("Enter the choice");
	ch=sc.nextInt();
	System.out.println("Enter two numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	if(ch<1||ch>=5)
	System.exit(0);
	switch (ch) {
	case 1: result =num1+num2;
	System.out.println("The sum of the given numbers is: "+result);
	
	break;
	case 2: result=num1-num2;
	System.out.println("The subtraction of the given numbers is: "+result);
	
	break;
	case 3: result=num1*num2;
	System.out.println("The multiplication of the given numbers is: "+result);
	
	break;
	case 4: result=num1/num2;
	System.out.println("The devision of the given numbers is: "+result);
	
	break;
	case 5:System.exit(0);
	default: System.out.println("Invalid Input");
	}//End of switch case 
	
}while (ch<=4);

	}//end of main

}//end of class
