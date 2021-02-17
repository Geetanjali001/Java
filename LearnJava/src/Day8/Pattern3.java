/*  WAP to print the below pattern
 		*	*	*	*	*
 		*	*	*	*
 		*	*	*
 		*	*
 		*
 */

package Day8;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {  //i=5   //i=4
			for(int j=1;j<=i;j++) {  //j=1//since the j value is not equal to i then j will
				//keep executing the loop until the value of j becomes 5, therefore the first output of j will be to print 5*
				//same logic will be executed for j every-time until i value becomes 1
				System.out.print("*\t");
			}//end of j
			System.out.println();
		}//end of i

	}

}
