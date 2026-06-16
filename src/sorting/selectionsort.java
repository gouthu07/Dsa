package sorting;

import java.util.Arrays;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,2,1,7,5,8,3,4};
		for(int i=0;i<arr.length;i++)
		{
			int cmin=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[cmin])
				{
					cmin=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[cmin];
			arr[cmin]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
