package dsa;

public class sda {
	
	int[] arr;
	sda(int size)
	{
		arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	public void insert(int index,int value) {
		try
		{
			if(arr[index]==Integer.MIN_VALUE)
			{
				arr[index]=value;
				System.out.println("Value is inserted");
			}
			else {
				System.out.println("Already inserted");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid index");
		}
	}
	
	public void traverse() {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public void search(int target) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("Value found at index="+i);
				return;
			}
		}
		System.out.println("Value not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sda s=new sda(3);
		s.insert(1, 10);
		s.insert(0, 20);
		s.insert(2, 30);
		
		s.traverse();
		
		s.search(20);
		
		
	}

}
