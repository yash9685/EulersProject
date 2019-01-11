
public class PrimeNumber10001 {

	public static void main(String[] args) {
		
		int c=1;
		for(int i=2;;i++) {
			int counter=0;
			for(int k=i;k>=1;k--) 
			{
				if(i%k==0) 
					counter++;
			}
				if(counter==2) {
					
	               if(c==10001)
	               {
					      System.out.println(i);
	               }c++;
	               }
		}
		
			
			
		
	}

}
//104743