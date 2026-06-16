package dsa;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=28;
		int n2=56;
		int gcd=1;
		for(int i=1;i<=Math.min(n1, n2);i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
	}

}
