package dsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi hi hi how how are are u u java";
		Map<String, Integer> m=new LinkedHashMap<>();
		String[] s1=str.split(" ");
		for(String s:s1)
		{
			m.put(s, m.getOrDefault(s,0)+1);
		}
		m.forEach((Key,value)->{
			System.out.println(Key);
		});
		
		String a="programming";
		char[] b=a.toCharArray();
		Map<Character,Integer> c=new LinkedHashMap<>();
		for(Character x:b)
		{
			c.put(x, c.getOrDefault(x, 0)+1);
		}
		c.forEach((key,value)->{
			System.out.print(key);
		});
		System.out.println();
		int[] arr= {1,2,1,3,2,1};
		Map<Integer, Integer> mp=new LinkedHashMap<>();
		for(int x:arr)
		{
			mp.put(x, mp.getOrDefault(x, 0)+1);
		}
		mp.forEach((key,value)->{
			System.out.println(key);
		});

	}

}
