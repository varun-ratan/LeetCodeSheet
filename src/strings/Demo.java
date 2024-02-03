package strings;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String s2="World";
		StringBuffer s3=new StringBuffer("Hello");
		s3.append("World");
		System.out.println(s3);
		s=s2;
		String s1=new String("Hello");
		
		if(s==s1)
		{
			System.out.println("s and s1 are equal");
		}
		else if(s.equals(s1))
		{
			System.out.println("s.equals(s2)");
		}
		else
		{
			System.out.println("s and s1 are not equal");
		}

	}

}
