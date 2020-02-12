package com.fjx.algorithm;

public class Utils {
	
	static long pow(long a,long n) {
		long s = a;
		int n2 = 1;
		while((n2<<1)<=n) {
			n2<<=1;
			s*=s;
		}
		return (long) (s*Math.pow(a, n-n2));
	}
	
	public static void main(String[] args) {
		System.out.println(pow(2,2));
	}
}
