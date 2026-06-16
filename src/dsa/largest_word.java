package dsa;

public class largest_word {
	
	static String large(String s)
	{
		String[] str=s.split(" ");
		String longest=" ";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>longest.length())
			{
				longest=str[i];
			}
		}
		return longest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello hii bro whatsup man!";
		System.out.println(large(s));
	}

}
