package com.fjx.algorithm;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] a = {5646,486,6,4,85,46,6,86,873,48};
		quickSort2(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	static void quickSort(int[] a,int l,int r) {
		if(l>=r)
			return;
		int p = partition(a, l, r);
		quickSort(a, l, p-1);
		quickSort(a, p+1, r);
	}
	static void quickSort2(int[] a,int l,int r) {
		if(l>=r)
			return;
		int p = partition2(a, l, r);
		quickSort(a, l, p-1);
		quickSort(a, p+1, r);
	}
	
	static int partition(int[] a,int l,int r) {
		int m = l;
		int sp = l+1;
		int rp = r;
		while(sp<=rp) {
			if(a[sp]<=a[m]) {
				sp++;
			}else {
				swap(a, sp, rp);
				rp--;
			}
		}
		swap(a, m, rp);
		return rp;
	}
	
	static void swap(int[] a,int i,int j) {
		if(a[i]!=a[j]) {
			a[i]^=a[j];
			a[j]^=a[i];
			a[i]^=a[j];
		}
	}
	
	static int partition2(int[] a,int l,int r) {
		int p = l;
		int left = l+1;
		int right = r;
		while(left<=right) {
			while(left<=right && a[left]<=a[p])
				left++;
			while(left<=right && a[right]>a[p])
				right--;
			if(left<right)
				swap(a,left, right);
		}
		swap(a, right, p);
		return right;
	}

}
