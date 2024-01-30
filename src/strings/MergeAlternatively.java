package strings;

public class MergeAlternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1="ab";
		String word2="pqrs";
		String s=mergeAlternately(word1,word2);

	}
	
	 public static String mergeAlternately(String word1, String word2) {
	        int i=0,j=0;
	        String s="";
	        StringBuilder s1=new StringBuilder();
	        System.out.println(word1.length());
	        System.out.println(word2.length());
	        while(i<word1.length() || j<word2.length())
	        {
	        	if(i<word1.length())
	        	s1=s1.append(word1.charAt(i));
	        	if(j<word2.length())
	            s1=s1.append(word2.charAt(j));
	        	System.out.println(s1);
	              i++;
	              j++;

	        }
	       
	        return s1.toString();
	    }

}
