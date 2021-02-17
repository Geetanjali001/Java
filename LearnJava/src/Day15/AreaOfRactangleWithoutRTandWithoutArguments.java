package Day15;

import java.util.Scanner;

public class AreaOfRactangleWithoutRTandWithoutArguments {
	
	public void AreaOfRactangle() {
		int length=0;
		int bidth=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter length and bidth of ractangle");
		length=sc.nextInt();
		bidth=sc.nextInt();
		int area=length*bidth;
		System.out.println(+area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRactangleWithoutRTandWithoutArguments ob=new AreaOfRactangleWithoutRTandWithoutArguments();
        ob.AreaOfRactangle();
	}

}
