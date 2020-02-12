package com.fjx.cg.package2;

import java.util.Scanner;

public class MainF {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sum = new int[n+1];
		for(int i=1;i<=n;i++) {
			sum[i] = sum[i-1]+sc.nextInt();
		}
		int ans = 0;
		for(int i=1;i<n;i++) {
			if(sum[i]==sum[n]-sum[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
