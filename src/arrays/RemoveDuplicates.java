package arrays;
import java.util.*;
public class RemoveDuplicates {
	public static void main(String []args)
	{
		int a[]= {5,2,4,5,2,3,1,10};
		HashMap<Integer, Integer> hash=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(hash.get(a[i])==null)
			{
				System.out.print(a[i]+" ");
			}
			hash.put(a[i], 1);
		}
		
//		Arrays.stream(a)
//			.distinct()
//			.forEach(System.out::print);
		
	}

}
