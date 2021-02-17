package com.qa.basics;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int p=10000;
   float r= 2.5f;
   int t= 10;
   float si= (p*r*t)/100;
   System.out.println("the simple interest: "+si);
  // System.out.println(2+25*10);
   float amount = p+si;
   System.out.println("amount to be paid "+amount);
	}

}
