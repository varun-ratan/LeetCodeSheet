package arrays;

public class FindNumbersWithEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//as 555--->no. of digit is 3 so it's not even
		//1771 --> no. of digit is 4, so it's even digit
		int nums[]= {555,901,482,1771};
		int res=findNumbers(nums);
		System.out.println("The numbers containing even digit is "+res);

	}
	
    
	 public static int findNumbers(int[] nums) {
	        
	        int res=0;        
	        for(int i=0;i<nums.length;i++)
	        {
	            int temp=nums[i];
	            int count=0;
	            while(temp!=0)
	            {
	                count++;
	                temp=temp/10;
	            }
	            if(count%2==0)
	            {
	                res++;
	            }
	        }
	        return res;
	        
	    }


}
