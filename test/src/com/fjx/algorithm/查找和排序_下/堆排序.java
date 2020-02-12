package com.fjx.algorithm.查找和排序_下;

import java.util.Arrays;

public class 堆排序 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		heapSort2(arr);
		System.out.println(Arrays.toString(arr));
	}
	
//	堆化方法，将数据已大顶堆的方式处理，大顶堆排序后数据从小到大排序
	public static void maxHeap(int[] arr) {
		for(int i=arr.length/2-1;i>=0;i--) {
			maxHeapFixDown(arr,i,arr.length-1);
		}
	}
	
//	大顶堆向下调整
	public static void maxHeapFixDown(int[] arr,int i,int n) {
		int left = i*2+1,right = i*2+2;
		int max = left;
		if(left>n) {
			return;
		}
		if(right<=n) {
			if(arr[right]>arr[left]) {
				max = right;
			}
		}
		if(arr[i]<arr[max]) {
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
		maxHeapFixDown(arr, max,n);
	}
//	堆排序方法
	public static void heapSort(int[] arr) {
		maxHeap(arr);
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]<arr[0]) {
				int temp = arr[i];
				arr[i] = arr[0];
				arr[0] = temp;
			}
			maxHeapFixDown(arr, 0,i-1);
		}
	}
	
	public static void minHeap(int[] arr) {
		for(int i=arr.length/2;i>=0;i--) {
			minHeapFixDown(arr,i,arr.length-1);
		}
	}
	
	public static void minHeapFixDown(int[] arr,int i,int n) {
		int left = i*2+1,right = i*2+2;
		int min = left;
		if(left>n) {
			return;
		}
		if(right<=n) {
			if(arr[right]<arr[left]) {
				min = right;
			}
		}
		if(arr[i]>arr[min]) {
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		minHeapFixDown(arr,min,n);
	}
	
	public static void heapSort2(int[] arr) {
		minHeap(arr);
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[0]<arr[i]) {
				int temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
			}
//			在堆排序中要注意每次从对顶向下调整
			minHeapFixDown(arr,0,i-1);
		}
	}

}
