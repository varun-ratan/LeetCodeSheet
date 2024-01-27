package maths;

import java.util.*;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int a=sc.nextInt();
		if(a<Integer.MIN_VALUE)
			System.out.println("Entered value is not in integer scope");
		long sum=0;
		while(a!=0)
		{
			sum=sum*10+a%10;
			a=a/10;
			if(sum>Integer.MAX_VALUE)
			{
				System.out.println("Entered value is not in integer scope");
				break;
			}
			
		}
		System.out.println("Reversed number is "+ sum);
		
		

	}

}
