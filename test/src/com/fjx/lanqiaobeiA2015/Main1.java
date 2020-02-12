package com.fjx.lanqiaobeiA2015;

public class Main1 {
	static int ans;
	
	public static void main(String[] args) {
		f(1543);
		System.out.println(ans);
	}
	
	public static void f(int n) {
		
		if(n<=1) {
			ans++;
			return;
		}
		
		if(n%2==0) {
			f(n/2);
		}else {
			ans++;
			f((n-1)/2);
		}
	}

}
