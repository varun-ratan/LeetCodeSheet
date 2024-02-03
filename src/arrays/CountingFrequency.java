package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CountingFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,3,1,1,1,4,1,2,2};
		//Arrays.sort(a);
		SortedMap<Integer,Integer> hash=new TreeMap<>();
		for(int i=0;i<a.length;i++) {
			if(hash.containsKey(a[i]))
			{
				int temp=hash.get(a[i]);
			//	System.out.println(temp);
				hash.put(a[i], temp+1);
				
				
			}
			else
			{
				hash.put(a[i], 1);
			}
		}

		
		for(Map.Entry<Integer, Integer> entry: hash.entrySet())
		{

				System.out.println(entry.getKey() +" "+entry.getValue());	
		}
		
	}

}
