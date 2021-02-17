//WAP to print 1 2 3 4 5 ....10 using while loop
/*
 	while loop syntax					for loop syntax
 	initialization;						for(initialization;condition;inc/dec)
 	while(condition)					{
 	{											stmts;
 		stmts;							}
 		inc/dec
 	}
 */

package Day6;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		while (n<=10) {
			System.out.print(n+ " ");
			n++;
		}

	}

}
