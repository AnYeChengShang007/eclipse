package com.fjx.algorithm.��ά���������;

import com.fjx.util.MyUtil;

/*
 * ���������ĳ��Ԫ��Ϊ0�����������к�������
 */
public class �����ڵ��������� {
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
