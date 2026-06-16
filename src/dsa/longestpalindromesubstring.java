package dsa;

public class longestpalindromesubstring {
	public static boolean isPalindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
				
		}
		return true;
		
	}
	
	public static String longestpalindromic(String s)
	{
		int maxlength=0;
		String res="";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String sub=s.substring(i, j+1);
				if(isPalindrome(sub) && maxlength<sub.length())
				{
					res=sub;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="babad";
		System.out.println(longestpalindromic(s));
	}

}
