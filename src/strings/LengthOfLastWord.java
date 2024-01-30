package strings;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
		int n=lengthOfLastWord(s);
		System.out.println(n);

	}
    public static int lengthOfLastWord(String s) {
        // int count=0;
        // int j=0;
        // for(int i=s.length()-1;i>=0;i--)
        // {
        //     if(s.charAt(i)!=' ')
        //     {
        //         j=i;
        //         break;
        //     }
        // }
        // for(int i=j;i>=0;i--)
        // {
        //     if(s.charAt(i)==' ')
        //     {
        //         break;
        //     }
        //     else
        //     {
        //         count++;
        //     }
        // }
        // return count;

        String res[]=s.split(" ");
        return res[res.length-1].length();
    }

}
