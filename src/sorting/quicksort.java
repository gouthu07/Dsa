  package sorting;

import java.util.Arrays;

public class quicksort {
	
	static int pivot(int[] arr,int li,int hi)
	{
		int pi=hi;
		int j=li-1;
		for(int i=li;i<=hi;i++)
		{
			if(arr[i]<=arr[pi])
			{
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return j;
	}
	
	static void divide(int[] arr,int li,int hi)
	{
		
		if(li<hi)
		{
			int pivot=pivot(arr, li, hi);
			divide(arr, li, pivot-1);
			divide(arr, pivot+1, hi);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,2,1,7,5,8,3,4};
		divide(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
