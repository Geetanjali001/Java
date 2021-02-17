/* WAP to print he below pattern
 			1	2	3	4	5
row#1 		*	*	*	*	*
row#2 		*	*	*	*	*
row#3 		*	*	*	*	*
row#4 		*	*	*	*	*
row#5 		*	*	*	*	*

 */

package Day8;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print("*\t");
			}//end of j
			System.out.println();
		}//end of i

	}//End of main

}//end of class
