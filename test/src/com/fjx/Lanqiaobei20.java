package com.fjx;

import java.util.Scanner;

public class Lanqiaobei20 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		long ans = 0;
		for(int i=0;i<=n;i++) {
			int a = (int) (Math.pow(i,k)%999101);
			ans+=zuHe(n,i)*zuHe(n,m)*a;
			if(ans>999101)
				ans%=999101;
		}
		System.out.println(ans);
		
	}
	
	
	static long f(int i) {
		long ans = 1;
		for(int r=1;r<=i;r++) {
			ans*=r;
		}
		return ans;
	}
	
	static long f2(int a,int b) {
		long ans = 1;
		for(int i=a;i<=b;i++) {
			ans*=i;
		}
		return ans;
	}
	
	static long zuHe(int n,int m) {
		int t = 0;
		if(m<=n/2) {
			t=n-m;
			return f2(t+1,n)/f(m);
		}else {
			return f2(m+1,n)/f(n-m);
		}
	}
	

}
