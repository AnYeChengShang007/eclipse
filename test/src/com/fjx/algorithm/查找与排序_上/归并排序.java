package com.fjx.algorithm.查找与排序_上;

public class 归并排序 {
	
	public static void mergeSort(int arr[],int l,int r) {
		int mid = l+(r-l)/2;
		mergeSort(arr, l, mid-1);
		mergeSort(arr, mid+1, r);
		merge(arr,l,mid,r);
	}
	
	public static void merge(int arr[],int l,int mid,int r) {
		int[] arr1 = new int[arr.length];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		int p1 = l,p2 = mid+1,p = l;
		while(p1<=mid && p2<=r) {
			if(arr1[p1]<=arr[p2]) {
				arr[l++]=arr1[p1++];
			}else {
				arr[l++]=arr1[p2++];
			}
		}
		while(p1<=mid) {
			arr[l++]=arr1[p1++];
		}
	}
}
