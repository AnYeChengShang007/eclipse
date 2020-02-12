package com.fjx.algorithm.查找和排序_下;

import java.util.Arrays;

/*
 * 要求时间复杂度为O（n）
 */
public class 奇数在偶数前面 {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		fun(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void fun(int[] arr) {
		int[] arr1 = new int[arr.length];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		int begin = 0,end = arr.length-1,scan=0;
		while(scan<arr.length) {
			if((arr1[scan]&1)==0) {
				arr[end--] = arr1[scan++];
			}else {
				arr[begin++] = arr1[scan++];
			}
		}
		
	}

}
