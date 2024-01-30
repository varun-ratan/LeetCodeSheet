package arrays;

public class MonotonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,4,3,1};
		System.out.println(isMonotonic(nums));

	}
	 public static boolean isMonotonic(int[] nums) {
	        int count=0,count2=0;
	        for(int i=0;i<nums.length-1;i++)
	        {
	            if(nums[i]<nums[i+1])
	            {
	                count++;
	            }
	            else if(nums[i]>nums[i+1] )
	            {
	                count2++;
	            }
	            else
	            {
	                count++;
	                count2++;
	            }
	        }
	        if(count==nums.length-1 || count2==nums.length-1)
	        {
	            return true;
	        }
	    return false;
	    }
}
