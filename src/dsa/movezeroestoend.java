package dsa;

import java.util.Arrays;

public class movezeroestoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,0,1,3,0,3};
		int j=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
