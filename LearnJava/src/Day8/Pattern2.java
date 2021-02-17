/* WAP to print the below pattern
 		1	*
 		2	*	*
 		3	*	*	*
 		4	*	*	*	*
 		5	*	*	*	*	*
 */

package Day8;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {         //i=1  //i=2    i=3     i=4         i=5
			for(int j=1;j<=i;j++) {
				System.out.print("*\t");//j=1  //j=1,2  j=1,2,3 //j=1,2,3,4  j=1,2,3,4,5
			}//end of j
			
			System.out.println();
		}//end of i

	}

}
