package Day15;

import java.util.Scanner;

public class ArmstrongNumNoRTwithArgu {
	public void FindArmstrongNum (int num) {
		int rem=0;
		int cube=0;
		int sum=0;
		int a=num;
		while (num!=0) {
			rem =num%10;
			cube = rem*rem*rem;
			sum=sum+cube;
			num=num/10;
		}
		System.out.println("the sum of the armstorng num is: "+sum);
		if (sum==a)
			System.out.println("this is a armstorng num");
		else
			System.out.println("This is not a armstorng num");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumNoRTwithArgu ob=new ArmstrongNumNoRTwithArgu();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		ob.FindArmstrongNum(num);
		

	}

}
