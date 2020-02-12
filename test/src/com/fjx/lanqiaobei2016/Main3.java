package com.fjx.lanqiaobei2016;

public class Main3 {
	
	public static int[] a= {1,2,3,4,5,6,7,8,9};
	static int sum=0;
	
	public static void main(String[] args) {
		f(0);
		System.out.println(sum);
	}
	
	public static void f(int k) {
		
		if(k==9) {
			int x = 100*a[3]+10*a[4]+a[5];
			int y = 100*a[6]+10*a[7]+a[8];
			if(a[0]*a[2]*y +a[1]*y+a[2]*x==10*a[2]*y) {
				sum++;
			}
		}
		
		for(int i=k; i<a.length; i++) {
			int t = a[k];
			a[k] = a[i];
			a[i] = t;
			f(k+1);
			t = a[k];
			a[k] = a[i];
			a[i] = t;
		}
		
	}
	
}
