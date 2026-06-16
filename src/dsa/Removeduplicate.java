package dsa;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicate {
	public static Set<Integer> remdup(int[] arr)
	{
		HashSet<Integer> unique=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			unique.add(arr[i]);
		}
		return unique;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,3,4,5,5};
		System.out.println(remdup(arr));
	}

}
