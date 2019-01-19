
public class Euler3 {

	public static void main(String[] args) {
		double n=600851475143.0;
		double i=2;
		while(i<=n) {
			if(n%i==0) {
				n=n/i;
				System.out.println(i);
				}
			i++;
		}

	}

}
            //6857