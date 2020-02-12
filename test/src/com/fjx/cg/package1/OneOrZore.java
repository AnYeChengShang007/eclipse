package com.fjx.cg.package1;

import java.util.Scanner;

public class OneOrZore {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] ans = new int[n];
		a[0] = sc.nextInt()&1;
		for(int i=1;i<n;i++) {
			a[i] = sc.nextInt()&1;
			b[i] = b[i-1]+a[i];
		}
		ans[0] = a[0];
		for(int i=1;i<n;i++) {
			ans[i] = ((i+1)*a[0]+b[i])&1;
		}
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
	}

}
