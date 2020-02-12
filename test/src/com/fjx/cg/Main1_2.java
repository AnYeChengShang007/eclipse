package com.fjx.cg;

import java.util.Scanner;

public class Main1_2 {
	static long gcd(long a,long b) {
		while(a!=0) {
			long t = a;
			a = b%a;
			b = t;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int L = sc.nextInt();
		if(m==n) {
			System.out.println("Impossible");
			return;
		}
		int a = m - n;
		int b = L;
		long gcd = Ext_gcd.gcd(a, b);
		m = y - x;
		if(m%gcd!=0){
			System.out.println("Impossible");
			return;
		}
		long d;
		try {
			d = Ext_gcd.linearEquation(a, b, m);
			long x0 = Ext_gcd.x;
			b /= d;
			b = Math.abs(b);

			x0 = (x0 % b + b) % b;
			System.out.println(x0);
		} catch (Exception e) {
			System.out.println("Impossible");
		}
	}

	private static class Ext_gcd {
		public static long x, y;

		public static long gcd(int a, int b) {
			if (b == 0) {
				x = 1;
				y = 0;
				return a;
			}
			long res = gcd(b, a % b);
			long x1 = x;
			x = y;
			y = x1 - a / b * y;
			return res;
		}

		public static long linearEquation(int a, int b, int m) throws Exception {
			long d = gcd(a, b);
			if (m % d != 0) {
				System.out.println("Impossible");
			} else {
				long n = m / d;
				x *= n;
				y *= n;
			}
			return d;
		}
	}
}
