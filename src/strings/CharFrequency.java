package strings;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abababccbbaacc";
		HashMap<Character, Integer> hash=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(hash.containsKey(s.charAt(i)))
			{
				int temp=hash.get(s.charAt(i));
				hash.put(s.charAt(i), temp+1);
			}
			hash.put(s.charAt(i), 1);
		}
		
		for(Map.Entry<Character, Integer> entry: hash.entrySet())
		{

				System.out.println(entry.getKey() +" "+entry.getValue());	
		}
		

	}

}
