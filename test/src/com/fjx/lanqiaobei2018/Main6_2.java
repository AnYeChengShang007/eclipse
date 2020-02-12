package com.fjx.lanqiaobei2018;

import java.util.Scanner;

public class Main6_2 {
	
	static int[] a;
	static int[] b;
	static int[] c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n];
		b = new int[n];
		c = new int[n];
		int[] aa = new int[n];
		int[] bb = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			c[i] = sc.nextInt();
		}
		long sum = 0;
		int oj=0,oq=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]<b[j]) {
					aa[i] = n-j;
					break;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(b[i]<c[j]) {
					bb[i] = n-j;
					break;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			sum+=aa[i]*bb[i];
		}
		System.out.println(sum);
	}

}
