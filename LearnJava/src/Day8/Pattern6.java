

/* WAP to print the below pattern


 		5	4	3	2	1
 		5	4	3	2
 		5	4	3
 		5	4
 		5
 */package Day8;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=5;i>=1;i--) {
	int a=5;
	for(int j=1;j<=i;j++){
		System.out.print(a+"\t");
		a--;
	}//end of j
	System.out.println();
	
}//end of i
	}

}
