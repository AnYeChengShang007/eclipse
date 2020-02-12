package com.fjx.lanqiaobeic2013;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i=0;i<n;i++) {
			int max = a[i];
			int min = a[i];
			for(int j=i;j<n;j++) {
				if(max<a[j]) max = a[j];
				if(min>a[j]) min = a[j];
				if(i==j)
					ans++;
				else {
					if(j-i+1==max-min+1)
						ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
