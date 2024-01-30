package strings;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abab";
		System.out.println(repeatedSubstringPattern(s));

	}
	public static boolean repeatedSubstringPattern(String s)
	{
		StringBuilder c=new StringBuilder();
		int flag=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(flag==1)
			c=c.append(s.charAt(i));
			else
			{
			c.setLength(0);;
			c=c.append(s.charAt(i));
			}
			int k=0;
			System.out.println(c);
			for(int j=i+1;j<s.length();)
			{
				if(s.charAt(j)==c.charAt(k))
				{
					flag=1;
					System.out.println(s.charAt(j)+" "+c.charAt(k));
					int l=j;
					while(k<c.length() && j<s.length())
					{
						if(s.charAt(j++)!=c.charAt(k++))
						{
							break;
						}
						
					}
					
					
				}
				if(k==c.length() && c.length()!=1)
				{
					return true;
				}
			}
			
		}
		
		return false;
	}

}
