package arrays;

import java.util.Stack;

public class BaseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"5","2","C","D","+"};
		int n=calPoints(s);
		System.out.println(n);

	}
	   public static int calPoints(String[] operations) {
	        int sum=0;
	        Stack<Integer> s=new Stack<Integer>();
	        for(int i=0;i<operations.length;i++)
	        {
	            if(operations[i]=="C" && s.size()!=0)
	            {
	                s.pop();
	                //System.out.println("C "+c);
	                System.out.println(s);
	                
	            }
	            else if(operations[i]=="D" && s.size()!=0)
	            {
	                int val1=s.pop();
	                int c=val1*2;
	                
	                s.push(c);
	                System.out.println("D "+c);
	                System.out.println("Stack size "+s.size());
	                System.out.println(s);
	            }
	            else if(operations[i]=="+" && s.size()!=0)
	            {
	            	System.out.println("Stack size "+s.size());
	                int val2=s.pop();
	                System.out.println("val2 "+val2);
	                int val3=0;
	                if(s.size()!=0)
	                val2=s.pop();
	                System.out.println("val3 "+val3);
	                int c1=val2+val3;
	                s.push(c1);
	                System.out.println("+"+c1);
	            }
	            else //if(operations[i]!="+" && operations[i]!="D" && operations[i]!="C")
	            {
	                
	                s.push(Integer.parseInt(operations[i]));	
	                System.out.println("else "+operations[i]);
	                System.out.println("Stack size "+s.size());
	                System.out.println(s);
	            }
	        }
	        for(int i=0;i<s.size();i++)
	        {
	            sum+=s.pop();
	        }
	        return sum;
	   }
}
