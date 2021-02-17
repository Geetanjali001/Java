/*
  do while loop is also known as Exit Controlled loop
  do while loop will be executed atleast once regardless of the condition
  
  syntax of do while loop
  initialization;
  do
  {
  		stmts;
  		inc/dec;
  }while(condition);  // ; is there with while
  
 */
package Day7;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Prgram started");
    int i=-1;
    do {
    	System.out.println(i);
    	i++;
    }while (i>0);
	}//end of main

}//end of class
