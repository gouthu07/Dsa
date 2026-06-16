package dsa;

public class disraium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=135;
		int copy=n;
		int cnt=(int)Math.log10(n)+1;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum+=Math.pow(rem, cnt);
			cnt--;
			n/=10;
		}
		if(sum==copy)
		{
			System.out.println("It is diarium");
		}
		else {
			System.out.println("It is not a disarium number");
		}
	}

}
