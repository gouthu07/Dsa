package dsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class minrepeat {
	static int mini=Integer.MAX_VALUE;
	static String word;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi hi hi how  u u u";
		String[] s1=str.split(" ");
		
		
		Map<String, Integer> map=new LinkedHashMap<>();
		for(String s:s1)
		{
			map.put(s,map.getOrDefault(s, 0)+1);
		}
		map.forEach((key,value)->{
			if(value<mini)
			{
				mini=value;
				word=key;
			}
		});	
		System.out.println(word);
	}

}
