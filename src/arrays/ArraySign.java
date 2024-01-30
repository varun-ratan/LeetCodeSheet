package arrays;

public class ArraySign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
		int resSign=arraySign(nums);
		System.out.println("The sign of given array is "+resSign);

	}
	 public static int arraySign(int[] nums) {
	        int countNegative=0;
	        for(int i=0;i<nums.length;i++)
	        {
		        if(nums[i]==0)
		        {
		            return 0;
		        }
		        else if(nums[i]<0)
		        {
		            countNegative++;
		        }
	        }
	        if(countNegative%2==0)
	        {
	        	return 1;
	        }
	        return -1;
	        
	    }

}
