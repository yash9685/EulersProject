
public class Euler7Prime {

	public static void main(String[] args) {
		int x=1;
		int a=1;
		while(x<10001) {
			a=a+2;
			if(Prime(a)) {
				x++;
			}
		}
		System.out.println(a);

	}
	public static boolean Prime(int a) {
		if(a%2==0) {
			return false;
		}
		int cnt=3;
		while((cnt*cnt)<=a) {
			if(a%cnt==0) {
				return false;
			}else
				cnt=cnt+2;
		}
		return true;
	}

}
