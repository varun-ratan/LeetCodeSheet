package maths;

public class AddBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="111",b="1";
		String sum="";
		int carry=0;
		int i=a.length()-1,j=b.length()-1;
//		int i=Math.max(a.length()-1,b.length()-1);
//        int j=Math.min(a.length()-1,b.length()-1);
		while(i>=0 && j>=0)
		{
			System.out.println("Value of i "+i+" Value of j "+j);
			if(a.charAt(i)=='1' && b.charAt(j)=='1')
			{
				if(carry==1)
				{
					sum=sum.concat("1");
					System.out.println("fist if "+sum);
					//carry=1;
				}
				if(carry==0)
				{
					sum=sum.concat("0");
					//carry=1;
					System.out.println("first if else "+sum);
				}
				carry=1;
				System.out.println("first if value of carry "+carry);
			}
			else if(a.charAt(i)=='0' && b.charAt(j)=='1')
			{
				if(carry==1)
				{
					sum=sum.concat("0");
					carry=1;
					System.out.println("2nd if "+sum);
				}
				else
				{
					sum=sum.concat("1");
					carry=0;
					System.out.println("2nd if else "+sum);
				}
				System.out.println("2nd if value of carry "+carry);
			}
			else if(a.charAt(i)=='1' && b.charAt(j)=='0')
			{
				if(carry==1)
				{
					sum=sum.concat("0");
					carry=1;
					System.out.println("3rd if "+sum);
				}
				else
				{
					sum=sum.concat("1");
					carry=0;
					System.out.println("3rd if else "+sum);
				}
				System.out.println("3rd"
						+ " if value of carry "+carry);
			}
			else
			{
				if(carry==1)
				{
					sum=sum.concat("1");
				}
				else
				{
					sum=sum.concat("0");
				}
				carry=0;
				System.out.println("when both a & b is 0 "+sum);
			}
			i--;
			j--;
			System.out.println("Value of i "+i+" Value of j "+j);
		}
		System.out.println("Value of i "+i+" Value of j "+j);

		if(i>-1 )
		{	
			System.out.println("i>-1 "+sum);
			while(i>-1)
			{
				if(a.charAt(i)=='1')
				{
					if(carry==1)
					{
					sum=sum.concat("01");
					}
					if(carry==0)
					{
						sum=sum.concat("1");
					}
					
				}
				else
				{
					if(carry==1)
					{
					sum=sum.concat("1");
					}
					else
					{
						sum=sum.concat("0");
					}		
				}
				i--;
			}		
			
		}
		else
		{
			if(carry==1)
			{
				sum=sum.concat("1");
			}
		}
		StringBuilder res=new StringBuilder(sum);
		System.out.println(sum);
		
		System.out.println(res.reverse().toString());
		
	}

}
