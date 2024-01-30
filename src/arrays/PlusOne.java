package arrays;

import java.math.BigInteger;

public class PlusOne {
	public static void main(String []args)
	{
		int nums[]= {9,8,7,6,5,4,3,2,1,0};
		int res[]=plusOne(nums);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}

	public static int[] plusOne(int[] nums) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder();
		for(int i=0;i<nums.length;i++)
		{
			s=s.append(nums[i]);
		}
		System.out.println(s);
		String s1=s.toString();
		BigInteger c=new BigInteger(s1);
		BigInteger a=new BigInteger("1");
		BigInteger s2=c.add(a);
		String fs=s2.toString();
		//System.out.println(fs);
		int res[]=new int[fs.length()];
		for(int i=0;i<fs.length();i++)
		{
			//System.out.println(fs.charAt(i));
			res[i]=fs.charAt(i)-'0';
			//System.out.println(res[i]);
		}

		return res;
	}

}
