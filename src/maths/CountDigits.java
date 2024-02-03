package maths;

public class CountDigits {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=199;
		int sum=0;
		while(n!=0)
		{
		    sum=sum+n%10;
		    n=n/10;
		    if(n==0 && sum>=10 )
		    {
		        n=sum;
		      sum=0;
		    }
		   
		}
		System.out.println(sum);
	}

}
