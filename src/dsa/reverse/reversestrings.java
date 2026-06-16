package dsa.reverse;

import java.util.Scanner;

public class reversestrings {
	public static String reverse(String s)
	{
		char[] ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}
	public static void reverse1(String str)
	{
		char[] ch=str.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j)
		{
			if(!(ch[i]>='A' && ch[j]<='Z'))
			{
				i++;
			}
			if(!(ch[i]>='a' && ch[j]<='z'))
			{
				j--;
			}
			else{char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
			}
		}
		System.out.println(new String(ch));
	}
	
	public static void reverse2(String s) {
		char[] ch=s.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j)
		{
			if(ch[i]==' ' && ch[j]==' ')
			{
				i++;
				j--;
			}
			else if(ch[i]==' ')
			{
				i++;
			}
			else if(ch[j]==' ')
			{
				j--;
			}
			else {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(new String(ch));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		//1.
//		reverse(str1);
//		String ans="";
//		for(String s:str1.split(" "))
//		{
//			System.out.print(reverse(s)+" ");
//		}
		//reverse2(str1);
		reverse1(str1);
		
	}

}
