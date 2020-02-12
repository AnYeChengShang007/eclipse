package com.fjx.lanqiaobei2017;

import java.util.Scanner;

public class Main9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] chocolate = new int[n][2];
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			chocolate[i][0] = sc.nextInt();
			if(min>chocolate[i][0]) {
				min = chocolate[i][0];
			}
			chocolate[i][1] = sc.nextInt();
			if(min>chocolate[i][1]) {
				min = chocolate[i][1];
			}
		}
		
		int l = 1;
		int r = min;
		int ans = 1;
		while(l<=r) {
			int mid = (l+r)/2;
			int num = 0;
			for(int p=0;p<chocolate.length;p++) {
				num+=(chocolate[p][0]/mid)*(chocolate[p][1]/mid);
				if(num>=m) {
					ans = mid;
					l = mid+1;
					break;
				}
			}
			if(num<m) {
				r = mid-1;
			}
		}
		System.out.println(ans);
	}
	
	

}
