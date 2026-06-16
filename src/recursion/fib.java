package recursion;

public class fib {
	
	static int fi(int n)
	{
		if(n==0)
			return 0;
		else if(n==1||n==2)
			return 1;
		else
			return fi(n-1)+fi(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fi(6));
	}

}
