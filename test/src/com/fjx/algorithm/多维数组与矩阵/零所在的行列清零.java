package com.fjx.algorithm.多维数组与矩阵;

import com.fjx.util.MyUtil;

/*
 * 如果矩阵中某个元素为0，则将其所在行和列清零
 */
public class 零所在的行列清零 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4},
				{5,6,0,8},
				{9,0,11,12},
				{13,14,15,16}
		};
		MyUtil.printArray(arr);
		f(arr);
		MyUtil.printArray(arr);
	}
	
	public static void f(int[][] arr) {
		int[] px = new int[arr.length*arr[0].length];
		int[] py = new int[arr.length*arr[0].length];
		int index = 0;
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[0].length;y++) {
				if(arr[x][y]==0) {
					px[index] = x;
					py[index++] = y;
				}
			}
		}
		for(int i=0;i<index;i++) {
			int x = px[i];
			int y = py[i];
			for(int j=0;j<arr.length;j++) {
				arr[j][y] = 0;
			}
			for(int j=0;j<arr[0].length;j++) {
				arr[x][j] = 0;
			}
		}
	}
}
