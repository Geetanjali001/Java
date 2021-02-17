/*  WAP to input the sting element and search a string using Binary search
 * (a)String    AAA   BBB   CCC   DDD  EEE  FFF  GGG  III  JJJ  KKK  LLL  
   (i) Index     0     1     2     3    4    5    6    7    8    9    10   
   
   Beg=0
   Mid=(Beg+End)/2
   End=a.length-1
 
 */


package Day12;

import java.util.Scanner;

public class BinaryStringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input []=new String [10];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the elements of am array");
		for (int i=0;i<input.length;i++) {
			input[i]=sc.next();	
		}
		//input a string which need to be searched
		System.out.println("Enter the string which need to be searched");
		String item=sc.next();
		int flag=0;
		int beg=0;
		int end=input.length-1;
		int mid=0;
		while (beg>=end) {
			mid=(beg+end)/2;
			if(item==input[mid]) {
				flag=1;
				break;	
			}
			else if(item.equals(input[mid])){
				beg=mid+1;
			}
			else if (item.equals(input[mid])) {
				end=mid-1;
			}
		}//end of while loop 
		if(flag==1) {
			System.out.println("string found at position: "+mid);
		}
		else System.out.println("string not found");
	}

}
