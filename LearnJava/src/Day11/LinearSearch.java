/*
 		WAP to input an array of 10 integers elements and search a particular element in an array
 		
 		array
 		4	7	5	9	78	56	34	21	67 34
index	0	1	2	3	4	5	6	7	8	9

 		enter an element to be searched?
 		78    - item
 		
 		flag=1  // flag value will be 1 as soon as search element is found
 		position=4// element indexing position in java memory
 		Element found
 */
package Day11;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an array
				int a[]=new int[10];  // declare the size of an array
				
				//Input from user
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter element in an array");
				for(int i=0;i<a.length;i++) //accept the use input till the i value becomes 4
					                        //means i value will be incremented each time by 1 when loop run
					                        
				{
					a[i]=sc.nextInt(); //user can input the value as per the declared array
				}
				
				//input the number to be searched
				System.out.println("Enter a no to be searched");
				int item=sc.nextInt(); //user will enter a number to be searched
				
				int flag=0; // here 0 means element is not present inside the array
				int position = 0; //declare a variable "position" which will late store the position of the element 
				int i=0; // declare a local variable which will store the i value
				for(i=0;i<a.length;i++)//loop will execute until i value becomes 4(a length is 5)
					                   //as per java indexing last index number is 4
				{
					if(a[i]==item)//if a value of index i is ==searched element, condition true
						          // and flag value becomes 1, if condition false, loop will execute again
						          // flag value remain 0
					{
						flag=1;  // here 1 means element is present inside array
						position=i;  // here position takes the index value (i) where element is found
						break; // come out of the loop
					}
					
				}
				
				if(flag==1)// if flag value is 1
					System.out.println("Element found at position "+i);//print the index position of an array where element found
				else
					System.out.println("Element not found");//else print not found


	}

}
