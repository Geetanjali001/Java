package Day3;

import java.util.Scanner;

public class FindMaxAmong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter three numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int max=0;
		if (a>b && a>c) {
			System.out.println(a);
			max=a;
		}
		else if ( b>a && b>c){
			System.out.println(b);
				max=b;
			}
		else {
			max=c;
			System.out.println(c);
			
		}

	}

}
