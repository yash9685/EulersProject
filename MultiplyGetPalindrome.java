	public class MultiplyGetPalindrome {
        public static void main(String[] args) {
	    int max=-1,m=1;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
			     m= (i*j);
				 int temp=m;
					if (ispalin(m) && m>max)
					max = temp;
			 }
		}
		System.out.println(max);
	}
       public static boolean ispalin(int a) {
	
        int rem,rev=0,temp = a;
		while(a>0) {
		    rem=a%10;
			rev=rev*10+rem;	
			a=a/10;
		   }
		return  temp==rev;
		}	
	}
//906609
	
