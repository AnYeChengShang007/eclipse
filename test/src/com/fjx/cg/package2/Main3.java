package com.fjx.cg.package2;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		Ext_gcd.linearEquation(A, B, C);
		System.out.println(-Ext_gcd.x+""+-Ext_gcd.y);
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
				System.out.println("-1");
				System.exit(0);
			} else {
				long n = m / d;
				x *= n;
				y *= n;
			}
			return d;
		}
	}
}
