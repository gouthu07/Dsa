package searching;

public class linearsearch {
public static int ls(int[] arr,int target)
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==target)
		{
			return i;
		}
	}
	return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int target=5;
		System.out.println(ls(arr, target));
	}

}
