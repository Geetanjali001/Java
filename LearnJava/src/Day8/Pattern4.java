//WAP to print he below patern
/*
 		1	2	3	4	5
 		1	2	3	4	5
 		1	2	3	4	5
 		1	2	3	4	5
 		1	2	3	4	5
 */package Day8;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1;i<=5;i++) {   //i=1
	for (int j=1;j<=5;j++) {//j=1, the loop will keep executing until the j value becomes 5
		                    // so the out put for j will be printed as 1 2 3 4 5
		System.out.print(j+ "\t");
		
	}//end of j
	System.out.println();
	
}//end of i
	}

}
