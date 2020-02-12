package com.fjx.lanqiaobei2018;

import java.util.Scanner;

public class Main6 {
	
	public static void main(String[] args) {
		f();
		
	}
	
	public static void f() {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[3][N];
		for(int i=0;i<3;i++) {
			for(int j=0;j<N;j++) {
				int q = sc.nextInt();
				a[i][j] = q;
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(a[0][i]<a[1][j]) {
					for(int k=0;k<N;k++) {
						if(a[1][j]<a[2][k]) {
							sum++;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

}
