package com.fjx.algorithm.查找和排序_下;

import java.util.Arrays;

/*
 * 用尽量高的效率求出一个乱序数组中按
 * 数值顺序的第k个元素值
 */
public class 第k个元素 {
	
	public static void main(String[] args) {
		int a[] = {1,4,6,5,9,6,13,15,98};
		System.out.println(selectK(a,0,a.length-1,4));
	}
	
	public static int selectK(int[] arr,int begin,int end,int k) {
		
		int p = partition(arr, begin, end);
		int index = begin+k-1;
		if(p==index)
			return arr[p];
		else if(p<index) 
			return selectK(arr, p+1, end, k-(p-begin+1));
		else
			return selectK(arr, begin, p-1, k);
	}
	
	public static int partition(int[] arr,int begin,int end) {
		int p = begin;
		int l = begin+1,r = end;
		while(l<=r) {
			while(l<=r&&arr[l]<=arr[p]) {
				l++;
			}
			while(l<=r&&arr[r]>arr[p]) {
				r--;
			}
			if(l<r) {
				int t = arr[l];
				arr[l] = arr[r];
				arr[r] = t;
			}
		}
		int t = arr[begin];
		arr[begin] = arr[r];
		arr[r] = t;
		return r;
		
	}
	
	public static void quickSort(int[] arr,int begin,int end) {
		int p = partition(arr, begin, end);
		if(p-1>=begin)
			quickSort(arr, begin, p-1);
		if(p+1<=end)
			quickSort(arr, p+1, end);
	}
}


