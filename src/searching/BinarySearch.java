package searching;

public class BinarySearch {
	
	static int bs(int[] arr,int target)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+(high-low))/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,9,12,13,18};
		System.out.println(bs(arr, 4));
	}

}
