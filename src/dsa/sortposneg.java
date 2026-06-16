package dsa;

import java.util.Arrays;

public class sortposneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,-1,3,-2,4,5,-9};
		int j=0;
		int temp[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				temp[j++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				temp[j++]=a[i];
			}
		}
		System.out.println(Arrays.toString(temp));
	}

}
