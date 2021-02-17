/*	BinarySearch for String
 * Binary Search
 	Assumption: Numbers are either in ascending order or in descending order
 	
 	Consider you have a book with 500 pages
elements 	1	 2	 3	 4	 5 ......            .... 	500
index 		0	 1	 2	 3	 4			249 250			499
consider	beg							mid				end 
Consider again								beg			end

search for element 259 - item

find mid index
mid= (beg+end)/2  = (0+499)/2   = 249
since 259 still not in beginning range, then again consider the beg from 250 and end till the book last page
mid= (beg+end)/2	= (250+499)/2	=374
now the element 259 is found between 250 to 374, so now for me the end is now 373 as per java indexing
end= 373
 				250 ......... 373

mid= ()

if(item==a[mid])
		element found
else if(item>a[mid])
		beg=mid+1
else if(item<a[mid])
		end=mid-1
 	search page number 259
 	search 101
 	34		56		78		90		101		105		108
 	0		1		2		3		 4		 5	 	  6
 	
 	beg						mid						end
 									beg		mid		end
 									mid/beg/end
 */

package Day12;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an array
		int a[]=new int[5];
		
		//Input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element in an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//input the number to be searched
		System.out.println("Enter a no to be searched");
		int item=sc.nextInt();
		
		int flag=0; // here 0 means element is not present inside the array
		
		int beg=0;
		int end= a.length-1;
		int mid=0;
		
		while(beg<=end)                // for(int beg=0;beg<=end;)
		{
			mid=(beg+end)/2;
			
			if(item==a[mid])
			{
				flag=1;
				break;
			}
			else if(item>a[mid])  // instead of > use compareTo()
			{
				beg=mid+1;
			}
			else if(item<a[mid])
			{
				end=mid-1;
			}
		} // end of while loop
		
		if(flag==1)
		{
			System.out.println("Element found at position "+mid);
		}
		else
			System.out.println("Not found");
	}

}
