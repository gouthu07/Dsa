package dsa;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int cnt=String.valueOf(num).length();
		int c=(int)(Math.log10(num)+1);
		System.out.println(cnt);
		System.out.println(c);
	}

}
