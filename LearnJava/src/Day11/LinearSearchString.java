/*
 		Richa		Geetanjali		Hema		Anjali		Pragya
 		0			  1				  2				3			4
 		
 		Search for Anjali	
 		
 */
package Day11;

import java.util.Scanner;

public class LinearSearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String names[]=new String[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter names: ");
		
		for(int i=0;i<names.length;i++)
		{
			names[i]=sc.next();
		}
		
		System.out.println("Enter a name to be searched");
		String item=sc.next();
		
		int flag=0;
		for(int i=0;i<names.length;i++)
		{
			if(item.equalsIgnoreCase(names[i]))
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			System.out.println("Name exist");
		else
			System.out.println("Name does not exist");

	}

}
