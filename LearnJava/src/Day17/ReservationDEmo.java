/*
 	WAP to create a class Flight with following details
 	flightNo
 	flightName
 	source
 	destination
 	fare
 	noOfPassengers
 	bill
 	
 	methods: input(),
 	flightNo
 	flightName
 	source
 	destination
 	fare
 	
 	 display(),
 	  calculateBill()
 	 noOfPassengers
 	bill
 */
package Day17;

import java.util.Scanner;

public class ReservationDEmo {
	String Fnumber;
	String Fname;
    String Depsource;
    String Destination;
    double fare;
    int Passenger;
    String Pname;
    
    
    public void InputFlightDetail () {
    	Scanner sc=new Scanner (System.in);
    	System.out.println("Enter Flight and customer detail");
    	Fnumber=sc.next();
    	Fname=sc.next();
    	Depsource=sc.next();
    	Destination=sc.next();
    	Passenger=sc.nextInt();
    	Pname=sc.next();
    	Pname=sc.next();
    	fare=sc.nextDouble();
    }
    
    public void Display () {
    	System.out.println(Fnumber +"\t"+ Fname +"\t" + Depsource+ "\t"+Destination+ "\t"+Passenger+"\t"+Pname+ "\t" +fare);
    }
    public void CalculateTotalFair() {
    	double TotalBill=Passenger*fare;	
    	System.out.println("The total fare is: " +TotalBill);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReservationDEmo FR=new ReservationDEmo();
		FR.InputFlightDetail();
		FR.Display();
		FR.CalculateTotalFair();

	}

}
