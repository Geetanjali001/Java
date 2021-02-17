/*WAP to input integer elements in 2 D array and print even numbers 
 *
              col(0)  col (1)   col (2)    col(3)   
 row a(0)      4        6        5           7
__index________00_______01_______02________ 03
 row a(1)      1        3       10          12
__index________10_______11______12__________13
 row a(2)      11       8        9           3
__index________20_______21_______22_________23
 row a(3)      24       25       26         28
__index________30_______31_______32_________33
      
 even num: 4   6   10  12  8  24  26  28
 */

package Day12;

import java.util.Scanner;

public class PrintEvenElementsIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int [4][4];
Scanner sc=new Scanner (System.in);
System.out.println("Enter elements o an array");
for (int i=0;i<a.length;i++){
	for (int j=0;j<a[i].length;j++) {
		a[i][j]=sc.nextInt();
	}
	
}
System.out.println("The even elements of the array is: ");
for (int i=0;i<a.length;i++) {
	for (int j=0;j<a[i].length;j++) {
		if(a[i][j]%2==0) 
			System.out.print(a[i][j]);
	}
}
	}

}
