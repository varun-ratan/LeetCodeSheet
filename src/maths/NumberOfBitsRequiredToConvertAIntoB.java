package maths;

public class NumberOfBitsRequiredToConvertAIntoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10110;
		int b=11011;
		int c=a^b;
		int count=0;
		System.out.println(c);
		
		while(c!=0)
		{
			c=c&(c-1);
			count++;
		}
		
		System.out.println("Number of bits required to convert a into b is "+count);

	}

}
