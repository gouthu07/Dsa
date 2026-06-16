package dsa;

import java.util.Arrays;

public class checksortarray {
	
	public static boolean sorted(int[]  arr)
	{
		for(int i=1;i<arr.length;i++)
		{
//			for(int j=i+1;j<arr.length;j++)//Brute force
//			{
//				if(arr[j]<arr[i])
			if(arr[i-1]>arr[i])	//Optimezed 
				{
					return false;
				}
			}
//		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		
		if(sorted(a))
		{
			System.out.println("The arrays is sorted");
		}
		else {
			System.out.println("Not sorted");
		}
	}

}
