package com.fjx.cg;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextInt();
		long y = sc.nextInt();
		long m = sc.nextInt();
		long n = sc.nextInt();
		long L = sc.nextInt();
		long a = m-n;
		long b = L;
		long c = x-y;
		if(m==n) {
			System.out.println("Impossible");
			return;
		}
		long gcd = gcd(a, b);
		if(c%gcd!=0){
			System.out.println("Impossible");
			return;
		}
		{
			long t = 1;
			while(true) {
				if(((m%L)*(t%L))%L+x%L==((n%L)*(t%L))%L+y%L) {
					System.out.println(t);
					return;
				}
				t++;
			}
		}
	}
	
	static long gcd(long a,long b) {
		while(a!=0) {
			long t = a;
			a = b%a;
			b = t;
		}
		return b;
	}
	
}
