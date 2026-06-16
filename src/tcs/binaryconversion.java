package tcs;

public class binaryconversion {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		String binary=Integer.toBinaryString(n);
		System.out.println(binary);
		String res="";
		for(int i=0;i<binary.length();i++)
		{
			if(binary.charAt(i)=='1')
			{
				res+="0";
			}
			else {
				res+="1";
			}
		}
		int ans=Integer.parseInt(res,2);
		System.out.println(ans);
	}

}
