package com.fjx.lanqiaobei2016;

public class Main1 {
	public static void main(String[] args) {
		f2(100);
	}
	
	static void f1() {
		int[] a = new int[101];
		long sum = 0;
		for(int i=1; i<=100; i++) {
			a[i]=a[i-1]+i;
			sum+=a[i];
		}
		System.out.println(sum);
	}
	
	static void f2(int i) {
		System.out.println(a(i));
	}
	
	static int a(int i) {
		if(i==1)
			return 1;
		return a(i-1)+i;
	}
}
