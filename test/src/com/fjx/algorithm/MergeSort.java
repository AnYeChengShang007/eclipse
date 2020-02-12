package com.fjx.algorithm;

import java.util.Arrays;

public class MergeSort {
	
	static int[] a = new int[10];
	static {
		for(int i=0;i<a.length-1;i++) {
			a[i] = (int) (Math.random()*50);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		mergeSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}

	static void mergeSort(int[] a, int i, int j) {
		if(i>=j)
			return;
		int mid = i+((j-i)>>1);
		mergeSort(a, i, mid);
		mergeSort(a, mid+1, j);
		merge(a,i,mid,j);
	}
	
	static int[] helper = new int[10];

	static void merge(int[] a, int i, int mid, int j) {
		System.arraycopy(a, i, helper, i, j-i+1);
		int left = i;
		int right = mid+1;
		int cur = i;
		while(left<=mid && right<=j) {
			if(helper[left]<=helper[right]) {
				a[cur++] = helper[left++];
			}else {
				a[cur++] = helper[right++];
			}
		}
		while(left<=mid) {
			a[cur++] = helper[left++];
		}
	}
	
	

}
