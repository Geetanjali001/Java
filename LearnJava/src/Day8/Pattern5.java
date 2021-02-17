/* WAP to print the belpw pattern
 	1
 	1	2
 	1	2	3
 	1	2	3	4
 	1	2	3	4	5
 */

package Day8;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {     //i=1  //i=2
			for(int j=1;j<=i;j++) {  // j=1 since j is <=i in first loop then the j first 
				                     // out put will be 1, now the i loop will ve executing again
				                     //and i value will be incremented by 1 so now i value will be 2
				                     // now j value is still one and less then i, j value will be incremented
				                     // by 1 which is now equals to i so the output for j will be printed as 12 and so on.
				System.out.print(j+"\t");
			}
			System.out.println();
			
		}//end of i

	}

}
