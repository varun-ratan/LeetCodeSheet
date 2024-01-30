package strings;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="car";
		String t="arc";
		System.out.println(isAnagram(s,t));

	}
	 public static boolean isAnagram(String s, String t) {
	        if(t.length()!=s.length())
	        {
	            return false;
	        }
	        int i=0,j=0;
	        char cs[]=s.toCharArray();
	        char ct[]=t.toCharArray();
	        Arrays.sort(cs);
	        Arrays.sort(ct);
	        while(i<cs.length && j<ct.length)
	        {
	            if(cs[i]!=(ct[i]))
	            {
	                break;
	            }
	            i++;
	            j++;
	        }
	        if(i==cs.length || j==ct.length)
	        {
	            return true;
	        }
	    return false;
	        
	    }

}
