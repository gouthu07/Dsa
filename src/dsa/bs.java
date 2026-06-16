package dsa;

public class bs {
	
	public static int binarysearch(int[] a,int target) {
		int left=0;
		int right=a.length-1;
		while(left<=right)
		{
			int mid=(left+(right-left))/2;
			if(a[mid]==target)
			{
				return mid;
			}
			else if(a[mid]<target)
			{
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,5,6};
		int target=5;
		int c=0;
		int res=binarysearch(a, target);
		System.out.println(res);
	}

}
