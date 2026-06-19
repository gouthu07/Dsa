package dsa;

public class lcmandhcf {

	public static int hcf(int n1,int n2)
	{
		while(n2!=0)
		{
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		return n1;
	}
	
	public static int lcm(int n1,int n2)
	{
		return (n1*n2)/hcf(n1, n2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=21;
		int n2=63;
		
//		for(int i=1;i<=Math.min(n1, n2);i++)
//		{
//			if(n1%i==0 && n2%i==0)
//			{
//				gcd=i;
//			}
//		}
		System.out.println(hcf(n1, n2));
		System.out.println(lcm(n1, n2));
	}

}
