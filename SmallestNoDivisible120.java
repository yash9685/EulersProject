
public class SmallestNoDivisible120 {

	public static void main(String[] args) {

	for(int i=1;;i++) {
			int n=1;
			while(n<=20&&i%n==0) {
				n++;
				if(n==20) {
				System.out.println(i);
				break;
				}
			             }
		}
	}

}
