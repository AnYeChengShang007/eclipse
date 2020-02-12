package com.fjx.lanqiaobei2017;

import java.util.Arrays;

public class Main2 {
	
	static int[] a = {1,2,3,4,5,6,7,8,9};
	static int ans;
	
	public static void main(String[] args) {
		f(0);
		System.out.println(ans/6);
	}
	
	
	
	public static void f(int k) {
		
		if(k==9) {
			int x1 = a[0]+a[1]+a[3]+a[5];
			int x2 = a[0]+a[2]+a[4]+a[8];
			int x3 = a[5]+a[6]+a[7]+a[8];
			if(x1==x2 && x2==x3) {
				ans++;
			}
			return;
		}
		
		for(int i=k;i<a.length;i++) {
			int t = a[i];
			a[i] = a[k];
			a[k] = t;
			f(k+1);
			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
	}
}
