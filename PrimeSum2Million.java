
public class PrimeSum2Million {

	public static void main(String[] args) {
		double sum=0,c=1;
		for(int i=2;;i++) {
			int counter=0;
			System.out.println(i);
			for(double k=i;k>=1;k--) 
			{
				
				if(i%k==0) 
					counter++;
			}
				if(counter==2) {
					sum=sum+i;
					if (c==2000000) {
						System.out.println(i);
						System.out.println(sum);
						
					}c++;
					
				}
		
		}
		
	}
}

//1179908154