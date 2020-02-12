package com.fjx.algorithm.查找与排序_上;

import java.util.Arrays;

import junit.framework.Test;

public class 快速排序 {
	
	//双向扫描算法
	public static int partition_2(int arr[],int begin,int end) {
		int p = begin,sp = begin,big = end;
		while(sp<=big) {
			while(sp<=big && arr[sp]<=arr[p]) {
				sp++;
			}
			while(sp<=big && arr[big]>arr[p]) {
				big--;
			}
			if(sp<=big) {
				int t = arr[big];
				arr[big] = arr[sp];
				arr[sp] = t;
			}
		}
		int t = arr[big];
		arr[big] = arr[p];
		arr[p] = t;
		return big;
	}
	
	//单项扫描算法
	public static int partition(int arr[],int begin,int end) {
		int p = begin,sp = begin+1,big = end;
		while(sp<=big) {
			if(arr[sp]<=arr[p])
				sp++;
			else {
				int t = arr[big];
				arr[big] = arr[sp];
				arr[sp] = t;
				big--;
			}
		}
		int t = arr[big];
		arr[big] = arr[p];
		arr[p] = t;
		return big;
	}
	
	public static void quickSort(int arr[],int l,int r) {
		if(l<=r) {
			int p = partition(arr,l,r);
			quickSort(arr, l, p-1);
			quickSort(arr, p+1, r);
		}
	}
	
	public static void main(String[] args) {
		int a[] = {8,4,6,9,6,1,5};
		System.out.println(Arrays.toString(a));
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	@org.junit.Test
	public void test() {
		int a[] = {13,4,6,15,9,6,1,5,98};
		System.out.println(partition_2(a, 0, a.length-1));
		System.out.println(Arrays.toString(a));
	}
	

}
