/*
 	WAP to sort 10 integer elements in an array
 	
 elements	9	5	2	1	8
 index		0	1	2	3	4
 
 i=0		5	9	2	1	8
 			5	2	9	1	8
 			5	2	1	9	8
 			5	2	1	8	9	
 			
 i=1		2	5	1	8	9
 			2	1	5	8	9
 			
i=2			1	2	5	8	9

i=3			
				
 				67	34	12	10	3
 				0	1	2	3	4
 		
 				0	1	2	3	4
 i=0, j=0-3		34	67	12	10	3
 	  j=1		34	12	67	10	3
 	  j=2		34	12	10	67	3
 	  j=3		34	12	10	3	67	
 	  
 	  
 i=1  j=0-3		12	34	10	3	67
 	  j=1		12	10	34	3	67
 	  j=2		12	10	3	34	67
 	  j=3
 	  
 i=2  j=0-3		10	12	3	34	67
 	  j=1		10	3	12	34	67
 	  j=2
 	  j=3
 	  
 i=3 j=0-3		3	10	12	34	67
 	 j=1
 	 j=2
 	 j=3			
 */
package Day11;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
