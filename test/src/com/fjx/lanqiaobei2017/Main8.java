package com.fjx.lanqiaobei2017;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] f = new boolean[10000000];
		f[0] = true;
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int g = 1;
		for(int i=1;i<=n;i++) {
			a[i] = sc.nextInt();
			if(i==0) g=a[i];
			else g=gcd(g,a[i]);
			for(int j=0;j<10000000-a[i];j++) {
				if(f[j]) {
					f[j+a[i]] = true;
				}
			}
		}
		if(g!=1) {
			System.out.println("INF");
			return;
		}
		int ans = 0;
		for(int i=0;i<10000000;i++) {
			if(!f[i]) {
				ans++;
				System.out.println(i);
			}
		}
		System.out.println(ans);
		
	}
	
	static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	
	
}
