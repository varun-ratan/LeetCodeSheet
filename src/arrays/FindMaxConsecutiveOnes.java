package arrays;

public class FindMaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,0,1,1,0,1};
		int res=findMaxConsecutiveOnes(nums);
		System.out.println("Number of consecutive ones = "+res);

	}
	
	 public static int findMaxConsecutiveOnes(int[] nums) {
		 
		 ///-------------Time complexity=O(n^2)---------------------------
		 /*        int count=0;
		         int countOnes=0;
		         for(int i=0;i<nums.length;i++)
		         {
		             count=0;
		             for(int j=i;j<nums.length;j++)
		             {
		                 if(nums[j]==1)
		                 {
		                     count++;
		                     countOnes=Math.max(count,countOnes);
		                 }
		                 else
		                 {
		                     break;
		                 }
		             }
		            
		         }
		         return countOnes;
		 */
		  //--------------------Time complexity = O(n)---------------------
		         int count=0;
		         int res=0;
		         int i=0;
		         while(i<nums.length)
		         {
		             if(nums[i]==1)
		             {
		                 count++;
		                 res=Math.max(res,count);
		                 
		             }
		             else
		             {
		                 count=0;
		             }
		             i++;
		         }
		         return res;
		         
		         
		     }

}
