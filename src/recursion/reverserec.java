package recursion;

public class reverserec {
	
	static String rev(String s)
	{
		if(s.isEmpty())
			return s;
		else
			return rev(s.substring(1))+s.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rev("Verru"));
		
		String s="madaq";
		if(rev(s).equals(s))
		{
			System.out.println("It is an Palindrome");
		}
		else {
			System.out.println("Not an Palindrome");
		}
	}

}
