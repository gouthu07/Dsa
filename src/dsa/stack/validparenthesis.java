package dsa.stack;

import java.util.Stack;

public class validparenthesis {
	
	public static String validation(String s) {
		Stack<Character> stack=new Stack<>();
		if(s.length()%2!=0)
		{
			return "Invalid";
		}
		else {
			
			for(char ch:s.toCharArray())
			{
				if(ch=='{'||ch=='['||ch=='(')
				{
					stack.push(ch);
				}
				else if(stack.isEmpty())
				{
					return "invalid";
				}
				else if((ch=='}' && stack.pop()!='{')||(ch==']' && stack.pop()!='[')||(ch==')' && stack.pop()!='('))
				{
					return "invalid";
				}
			}
		}
		if(stack.isEmpty())
		return "valid";
		else
			return "invalid";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="({";
		System.out.println(validation(s));
	}

}
