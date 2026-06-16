package dsa;

public class primenumbers {
	public static boolean isPrime(int num) {
		int cnt=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
		}
		return cnt==2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		System.out.println(isPrime(n));
	}

}
