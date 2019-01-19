
public class Euler10 {

	public static void main(String[] args) {
		 int  MAX = 2000000;
	     long sum = 0;
		    for (int i = 2; i < MAX; i++){
		        if (checkPrime(i) == 1){
		            sum += i;
		        }
		    } System.out.println(sum);
	}
      int MAX = 2000000;
	public static int checkPrime(int n){
	    int range = n;
	    for (int i = 2; i < range; i++){
	        if (n%i == 0){
	            return 0;
	        }
	        range = n / i;
	    }
	    return 1;
	}

}
        //142913828922