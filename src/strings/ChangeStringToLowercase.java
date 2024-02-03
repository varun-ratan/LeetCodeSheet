package strings;

public class ChangeStringToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String res="";//new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				char c=(char) (s.charAt(i)+32);
				res=res.concat(String.valueOf(c));
			}
			else
			res=res.concat(String.valueOf(s.charAt(i)));
		}
		System.out.println(res);

	}

}
