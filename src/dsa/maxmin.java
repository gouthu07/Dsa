package dsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class maxmin {
	static int max;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,1,1,2,4,5,5};
		Map<Integer, Integer> map=new LinkedHashMap<>();
		for(int x:a)
		{
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		map.forEach((key,value)->{
			if(value>max)
				System.out.print(key+" ");
		});
		
		String str="hi hi hi  how are are u u u u java";
		Map<String, Integer> m=new LinkedHashMap<>();
		String[] s1=str.trim().split(" +");
		for(String s:s1)
		{
			m.put(s, m.getOrDefault(s,0)+1);
		}
		m.forEach((key,value)->{
			if(value>max)
				System.out.print(key+" ");
		});
		
		String l="java";
		char[] b=l.toCharArray();
		Map<Character,Integer> c=new LinkedHashMap<>();
		for(Character x:b)
		{
			c.put(x, c.getOrDefault(x, 0)+1);
		}
		c.forEach((key,value)->{
			if(value>max)
				max=value;
//				key=max;
			System.out.print(key+" ");
		});

		
	}

}
