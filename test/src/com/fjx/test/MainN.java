package com.fjx.test;

import java.util.Scanner;

public class MainN {
	
	
	public static void main(String[] args) {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] cs = s.toCharArray();
		int[][] a = new int[2][cs.length];
		for(int i=0;i<cs.length;i++) {
			if(cs[i]!='C')
				continue;
			for(int j=i+1;j<cs.length;j++) {
				if(cs[j]=='H')
					a[0][j]++;
			}
		}
		for(int i=0;i<cs.length;i++) {
			if(a[0][i]!=0) {
				for(int j=i+1;j<cs.length;j++) {
					if(cs[j]=='N')
						a[1][j] += a[0][i];
				}
			}
		}
		for(int i=0;i<cs.length;i++) {
			ans+=a[1][i];
		}
		System.out.println(ans);
	}
	

}
