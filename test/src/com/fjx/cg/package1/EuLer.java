package com.fjx.cg.package1;

import java.util.Scanner;

public class EuLer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]==1) {
				System.out.println(5);
			}else {
				System.out.println(a[i]+5);
			}
		}
	}
}
