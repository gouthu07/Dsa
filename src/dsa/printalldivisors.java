package dsa;

import java.util.ArrayList;
import java.util.List;

public class printalldivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=144;
		List<Integer> res=new ArrayList<>();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				res.add(i);
			}
		}
		System.out.println(res);
	}

}
