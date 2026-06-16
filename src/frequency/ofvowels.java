package frequency;

public class ofvowels {
	public static boolean isVowel(char ch)
	{
		return ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
		int[] freq=new int[127];
		for(char ch:s.toCharArray())
		{
			freq[ch]++;
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=0)
			{
			if(isVowel((char)i))
			{
				System.out.print((char)i+""+freq[i]);
			}
		}	
	}
	}

}
