
public class Euler5 {

	public static void main(String[] args) {
		long n=20;
		System.out.println("The smallest positive number divisible by number between 1-20 is: "+lcm(n));
             }
	public static long gcd(long a,long b) {
		if(a%b!=0) 
		return gcd(b, a%b);
		else
			return b;
	}
	public static long lcm(long n) {
		long c=1;
		for(long i=1;i<=n;i++) {
			c=(c*i)/(gcd(c,i));
		}
		return c;
	}
            }
           //232792560
