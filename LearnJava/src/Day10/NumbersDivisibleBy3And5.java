/* WAP to input the 10 integer elements and print the values divisible by both 3 and 5.
  numbers (a)  3 15 18 555 111 110 45 75 85 90
          (i)  0  1  2  3   4   5   6  7  8  9
   output         *     *           *  *     *
 */

package Day10;

import java.util.Scanner;

public class NumbersDivisibleBy3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int [10];
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<10;i++) {
			a[i]= input.nextInt();
		}
        System.out.println("Numbers which are divisible by 3 and 5 are: ");
        for (int i=0; i<10;i++) {
        	if(a[i]%3==0 && a[i]%5==0)
        		System.out.println(a[i]);
        }
	}

}
