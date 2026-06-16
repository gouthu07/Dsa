package tcs;

import java.util.Scanner;

public class frequencyeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int freq[] = new int[1001];

        for(int i=0;i<n;i++)
            freq[arr[i]]++;

        for(int i=0;i<1001;i++)
        {
            if(freq[i]!=0 && freq[i]%2==0)
                System.out.print(i+" ");
        }
//		System.out.println("HEllo world");
	}

}
