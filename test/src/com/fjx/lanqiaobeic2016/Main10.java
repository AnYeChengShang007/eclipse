package com.fjx.lanqiaobeic2016;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main10 {
	
	static TreeSet<Long> set = new TreeSet<Long>();
	static Long[] a;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			set.add(sc.nextLong());
		}
		n = set.size();
		a = new Long[n];
		set.toArray(a);
		Arrays.sort(a);
		if(a.length==1) {
			System.out.println(a[0]+"/"+1);
			return;
		}
		if(a.length==2) {
			long gcd = gcd(a[0],a[1]);
			System.out.println(a[1]/gcd+"/"+a[0]/gcd);
			return;
		}
		MyNumber a1 = new MyNumber(a[n-1], a[0]);
		MyNumber a2 = new MyNumber(a[n-2], a[0]);
		long gcd = gcd(a1.fenmu,a1.fenzi);
		a1.fenmu /= gcd;
		a1.fenzi /= gcd;
		gcd = gcd(a2.fenmu,a2.fenzi);
		a2.fenmu /= gcd;
		a2.fenzi /= gcd;
		long gcd1 = gcd(a1.fenmu,a2.fenmu);
		long gcd2 = gcd(a1.fenzi,a2.fenzi);
		System.out.println(gcd2+"/"+gcd1);
		
	}
	
	static class MyNumber{
		long fenzi;
		long fenmu;
		public MyNumber(long fenzi, long fenmu) {
			this.fenzi = fenzi;
			this.fenmu = fenmu;
		}
		
	}

	
	static long gcd(long a,long b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
}
