package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithSumZeroIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,-3,1,6};
		Map<Integer,Integer> set =new HashMap<>();
		set.put(0, 0);
		int prefixSum=0;
		int start=0,end=0;
		for(int i=0;i<a.length;i++)
		{
			prefixSum+=a[i];
			if(!set.containsKey(prefixSum))
			{
				set.put(prefixSum, i);
			}
			else
			{
				start=set.get(prefixSum)+1;
				System.out.println("start= "+start);
				end=i;
				System.out.println("end = "+end);
				break;
			}
		}
		int count=0;
		for(int i=start;i<=end;i++)
		{
			count+=a[i];
		}
		System.out.println(count);

	}

}
