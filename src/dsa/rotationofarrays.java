package dsa;

import java.util.Arrays;

public class rotationofarrays {
	
	public static void leftrotatebyones(int[] arr) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
			
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	}

	public static void rightrotatebyones(int[] arr)
	{
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.println(Arrays.toString(arr));
	}
	public static void leftrotatebyks(int[] nums,int k)
	{
		if(k>nums.length)
		{
			k=k%nums.length;
		}
		for(int i=0;i<nums.length;i++)
		{
			if(i<k)
			{
				System.out.println(nums[i+k]);
			}
			else {
				System.out.println(nums[nums.length-1]);
			}
		}
	}

	public static void rightrotatebyks(int[] nums, int k) {
		if (k > nums.length) {
			k = k % nums.length;
		}
		for (int i = 0; i < nums.length; i++) {
			if (i < k) {
				System.out.print(nums[nums.length + i - k] + " ");
			} else {
				System.out.print(nums[i - k] + " ");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4, 5, 6 };
		int k = 2;
		//leftrotatebyones(nums);
		rightrotatebyones(nums);
//		leftrotatebyks(nums, k);
//		rightrotatebyones(nums,k);

	}

}
