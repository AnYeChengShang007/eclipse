package com.fjx;

import java.util.Scanner;

public class Demo02 {
	static int[] a = new int[1000001];
	
	public static void main(String[] args) {
		a[1] = 1;
		a[2] = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = fibonacci(n);
		
		System.out.println(i);
	}
	
	public static int fibonacci(int n) {
		
		if(n==1||n==2)
			return a[1];
		
		for(int i=3;i<=n;i++) {
			a[i] = (a[i-1]+a[i-2])%10007;
		}
		
		return a[n];
	}
}
