
public class Euler6 {

	public static void main(String[] args) {
		int sum1=0,sum2=0;
		for(int i=1;i<=100;i++) {
			sum1=sum1+i;
			sum2=sum2+(i*i);
		}sum1=sum1*sum1;
		int result=sum1-sum2;
		System.out.println("the differnece between number is "+result);
	}

}
        //25164150