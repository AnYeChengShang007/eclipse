package com.fjx.algorithm.多维数组与矩阵;


/*
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 
 * 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */
public class 顺时针打印二维数组 {
	
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4,41},
				{5,6,7,8,42},
				{9,10,11,12,43},
				{13,14,15,16,44}
		};
		f(arr);
	}
	
	public static void f(int[][] arr) {
		int l = 0,r = arr[0].length-1,u = 0,d = arr.length-1;
		while(l<r && u<d) {
			
			int l2 = l;
			while(l<=r) {
				System.out.print(arr[u][l++]+" ");
			}
			l = l2;
			
			u++;
			int u2 = u;
			while(u<=d) {
				System.out.print(arr[u++][r]+" ");
			}
			u = u2;
			
			r--;
			int r2 = r;
			while(r>=l) {
				System.out.print(arr[d][r--]+" ");
			}
			r = r2;
			
			d--;
			int d2 = d;
			while(d>=u) {
				System.out.print(arr[d--][l]+" ");
			}
			d = d2;
			l++;
		}
	}
	

}
