package com.fjx.algorithm;

import java.util.Arrays;
import java.util.Random;

public class SelectK {
	
	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i=0;i<10;i++) {
			a[i] = new Random().nextInt(50);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(selectK(a, 0, a.length-1, 10));
	}

	static int selectK(int[] a,int l,int r,int k) {
		int q = partition(a, l, r);
		int qk = q-l+1;
		if(k==qk) {
			return a[q];
		}else if(k<qk) {
			return selectK(a, l, q-1, k);
		}else {
			return selectK(a, q+1, r, k-qk);
		}
	}
	
	static int partition(int[] a,int l,int r) {
		int p = l;
		int left = l+1;
		int right = r;
		while(left<=right) {
			while(left<=right && a[left]<=a[p]) {
				left++;
			}
			while(left<=right && a[right]>a[p]) {
				right--;
			}
			if(left<right) {
				swap(a, right, left);
			}
		}
		swap(a, p, right);
		return right;
	}
	
	static void swap(int[] a,int i,int j) {
		if(a[i]!=a[j]) {
			a[i]^=a[j];
			a[j]^=a[i];
			a[i]^=a[j];
		}
	}

}
