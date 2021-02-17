package Day24;



public class BMW {
	String CarModel;
	String CarStatus;
	public void InputCarInfo() {
		CarModel="7 series";
		CarStatus="New";
	}
	public static void Display() {
		System.out.println("Info is: "+CarModel+"\t"+CarStatus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW bm=new BMW ();
		bm.InputCarInfo();
		bm.Display();
	}

}
