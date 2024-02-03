package arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {1,2,3,0,0,0};
		int nums2[]= {2,5,6};
		int m=3,n=3;
		merge(nums1,m,nums2,n);

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       // int num[]=new int[m+n];
	        int i=0,j=0;
	        int k=0;
	        // if(nums1.length==0)
	        //     return ;//num2;
	        // if(nums2.length==0)
	        //     return;//
	        while(i<m && j<n)
	        {
	            if(nums1[i]<=nums2[j])
	            {
	                nums1[k++]=nums1[i++];
	                //num.add(nums1[i++]);
	                System.out.println(nums1[k++]);
	            }
	            else if(nums1[i]>nums2[j])
	            {
	                nums1[k++]=nums2[j++];
	               // num.add(nums2[j++]);
	                System.out.println(nums1[k++]);
	            }
	        }
	        while(i<m)
	        {
	            nums1[k++]=nums1[i++];
	           // num.add(nums1[i++]);
	            System.out.println(nums1[k++]);
	        }
	        while(j<n)
	        {
	            nums1[k++]=nums2[j++];
	            //num.add(nums2[j++]);
	            System.out.println(nums1[k++]);
	        }

	        
	    }

}
