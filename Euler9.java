
public class Euler9 {

	public static void main(String[] args) {
		int a,b,c;
		for(int i=1;i<1000;i++) {
			a=i;
			for(int j=1;j<1000;j++) {
				b=j;
				for(int k=1;k<1000;k++) {
					c=k;
					if(((a+b+c)==1000)&&(a<b&&b<c)&&((a*a+b*b)==c*c)) {
						System.out.println("a= "+a+" b= "+b+" c= "+c);
						int product=a*b*c;
						System.out.println("The product is = "+product);
					}
				}
			}
		}

	}

}
     //a= 200 b= 375 c= 425
     //The product is = 31875000