package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubarrayWithSumZero {
	public static void main(String[] args)
	{
		int a[]= {4,2,-3,1,6};
		Set<Integer> set =new HashSet<>();
		set.add(0);
		int prefixSum=0;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			prefixSum+=a[i];
			if(!set.contains(prefixSum))
			{
				set.add(prefixSum);
			}
			else
			{
				//System.out.println("The given array contains subarray with sum 0");
				flag=1;
				break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("The given array contains subarray with sum 0");
		}
		else
		{
			System.out.println("The given array doesn't contains subarray with sum 0");
		}
	}

}
