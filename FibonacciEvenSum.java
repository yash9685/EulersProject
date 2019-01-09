
public class FibonacciEvenSum {

	public static void main(String[] args) {
		int i=1;
		int a=1;
		int b=2;
		int c=0;int sum=0;
				while(c<4000000) {
			System.out.println(a);
			System.out.println(b);
			c=a+b;
			if(a%2==0) {
				sum=sum+a;
			}
			if(b%2==0) {
				sum=sum+b;
			}
			if(c%2==0) {
				sum=sum+c;
			}
			System.out.println(c);
			a=c+b;
			b=c+a;
			i++;
		}System.out.println("sum "+sum);
	}

}
