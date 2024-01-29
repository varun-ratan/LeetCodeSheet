package arrays;

import java.util.Stack;

public class PostfixExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};    //{"4","13","5","/","+"};
		int res=evalRPN(s);
		System.out.println("The result of postfix expression is "+res);

	}
	
	public static int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        String opr="";
        int  arr[]=new int[2];
        for(int i=0;i<tokens.length;i++)
        {
           
            if((tokens[i]=="+" || tokens[i]=="-" ||
             tokens[i]=="*" || tokens[i]=="/" ) && !s.isEmpty())
             {
                 opr=tokens[i];
                 int j=0;
                 int tempSum=0;
                 while(j<2)
                 {
                     arr[j++]=s.pop();
                 }
                 if(opr=="+")
                 tempSum=arr[1]+arr[0];
                 if(opr=="-")
                 tempSum=arr[1]-arr[0];
                 if(opr=="*")
                 tempSum=arr[1]*arr[0];
                 if(opr=="/")
                 tempSum=arr[1]/arr[0];
                 
                 System.out.println("Sum push "+tempSum);
                 s.push(tempSum);
             }
             else
             {
            	 int t=Integer.parseInt(tokens[i]);
            	 System.out.println("Element push "+t);
                 s.push(t);
                
             }
        }
        return s.pop();
    }

}
