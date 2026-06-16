package dsa;

import java.util.LinkedHashSet;
import java.util.Set;

public class longestsubstringnonrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcdccc";
		int i=0;
		int j=0;
		int maxlength=0;
		Set<Character> lhs=new LinkedHashSet<>();
		Set<Character> result=new LinkedHashSet<>();
		while(i<s.length())
		{
			if(!lhs.contains(s.charAt(i)))
			{
				lhs.add(s.charAt(i));
//				if(maxlength<lhs.size())
//				{
//	                    maxlength = lhs.size();
//	                    result=new LinkedHashSet<>(lhs);
//				}
				maxlength=Math.max(maxlength, lhs.size());
				i++;
			}
			else {
				lhs.remove(s.charAt(j));
				j++;
				}
		}
		System.out.println(maxlength);
		System.out.println(result);
		
	}

}
