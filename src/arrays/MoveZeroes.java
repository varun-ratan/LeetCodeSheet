package arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,0,94,0,44};
		moveZeroes(nums);

	}
	public static void moveZeroes(int[] nums) {
        int j=-1;
        if(nums.length==1)
         {
             return;
         }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
            return ;
        }
        for(int i=j;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
        	System.out.print(nums[i]+" ");
        }

        
    }

}
