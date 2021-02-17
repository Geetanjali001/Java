package Day8;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				for(int j=2;j<=100;j++)
				{
				int n=j; // 5
				int c=0;
				for(int i=1;i<=n;i++)   // i=1 2 3 4 5
				{
					if(n%i==0)    // 5%1==0 T  5%2==0 F 5%5==0 T
						c=c+1;		// c=2
				}
				if(c==2)
					System.out.println(n+" is prime no");
				}

			}

		

	}


