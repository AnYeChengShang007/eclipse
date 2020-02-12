package com.fjx.algorithm.查找与排序_上;

public class 二分查找_递归 {
	
	public static int binarySearch(int arr[],int left,int right,int key){
		if(left>right)
			return -1;
		int mid = (left+right)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(arr[mid]<key) {
			return binarySearch(arr, mid+1, right, key);
		}else {
			return binarySearch(arr, left, mid-1, key);
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,3,7,34,54,66,123};
		System.out.println(binarySearch(a, 0, a.length-1, 88));
	}

}
