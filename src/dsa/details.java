package dsa;

class Employee
{
	int eid;
	String ename;
	
	Employee(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	
	public int geteid()
	{
		return eid;
	}
	public String getename()
	{
		return ename;
	}
	
	public String toString()
	{
		return "Employee[eid="+eid+"ename="+ename+"]";
	}
}
public class details {

	Employee[] arr;
	
	public details(int size)
	{
		arr=new Employee[size];
	}
	public void insertion(int index,Employee emp) {
		try {
			if(arr[index]==null)
			{
				arr[index]=emp;
				System.out.println("Value inserted");
			}
			else {
				System.out.println("Value already inserted");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid");
		}
	}
	
	public void traverse() {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details d=new details(4);
		d.insertion(0, new Employee(0,"abc"));
		d.insertion(1, new Employee(1,"ac"));
		d.insertion(2, new Employee(3,"bc"));
		d.insertion(3, new Employee(2,"abbc"));
		
		d.traverse();
	}

}
