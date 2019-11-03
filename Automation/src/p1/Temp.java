package p1;

 public class Temp {
	 int sum=0;
	 
	 int digsum(int number) {
		 
		/* while(number>0) {
			 if(number==0) {
				 number= sum;
				 sum=0;
			 }*/
			 sum= sum+number%10;
			 number=number/10;
			 return sum;
		 }
		 
	
	 
	 public static void main(String[] argss) {
		 Temp tm= new Temp();
		 System.out.println("sum is --"+ tm.digsum(223));
		 
	 }
	 
 }



