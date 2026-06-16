package frequency;

import java.util.LinkedHashMap;
import java.util.Map;

public class ofeachcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
//		int[] freq=new int[127];
//		for(char ch:s.toCharArray())
//		{
//			freq[ch]++;
//		}
//		for(int i=0;i<freq.length;i++)
//		{
//			if(freq[i]!=0)
//			{
//				System.out.print((char)i+""+freq[i]);
//			}
//		}
		Map<Character, Integer> map=new LinkedHashMap<>();
		for(char ch:s.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		map.forEach((Key,Value)->{
			System.out.print(Key+""+Value);
		});
		
	}

}
