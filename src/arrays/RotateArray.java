package arrays;

import java.util.ArrayList;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write your code here.
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
				int temp=arr.get(arr.size()-1);
				for(int i=arr.size()-1;i>0;i--)
				{
					arr.add(i, arr.get(i-1));
				}
				arr.add(0, temp);
				
				for(int i=0;i<arr.size();i++)
				{
					System.out.print(arr.get(i)+" ");
				}

	}

}
