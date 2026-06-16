package recursion;

public class naturalnumber {
	
	static void print(int n)
	{
		//print natural numbers from 1-10
//		if(n<=10)
//		{
//			System.out.println(n);
//			print(++n);
//		}
		
		
		//Print numbers from 10-1
		if(n>0)
		{
			System.out.println(n);
			print(n-1);
		}
	}
	static void print1(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			print1(++n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print(10);
		print1(0);
	}

}
