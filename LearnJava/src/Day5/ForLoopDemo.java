package Day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1; optional	initialization (It will be executed only once)
			// i<=10 	necessary	condition (it will be executed every time till the loop is alive)
			// i++	optional	increment/decrement	(it will be executed every time till the loop is alive)
			int i=1;  //  is accessible within the class
			for(;i<=10;) 		//for(int i=1;i<=10;i++)
			{
				System.out.print(i+"\t");
				i++;
				
			} // End of for loop
			
			System.out.println("\n i: "+i);
			

	}

}
