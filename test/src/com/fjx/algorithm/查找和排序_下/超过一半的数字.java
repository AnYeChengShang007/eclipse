package com.fjx.algorithm.查找和排序_下;

import java.util.Arrays;

/*
 * 数组中有一个数字出现的次数超过了数组长度
 * 的一半，找出这个数字
 */
public class 超过一半的数字 {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,7,6,69,6,6,6,6};
		System.out.println(f(a,0,a.length-1));
		System.out.println(f2(a));
	}
	//分区法
	public static int f(int[] arr,int begin,int end) {
		int p = partition(arr, begin, end);
		if(p==arr.length/2) {
			return arr[p];
		}else if(p<arr.length/2) {
			return f(arr, p+1, end);
		}else {
			return f(arr, begin, p-1);
		}
	}
	
	//消除法O（n）
	public static int f2(int[] arr) {
		int candidate = arr[0];
		int times = 1;
		int index = 1;
		while(index<arr.length) {
			if(times==0) {
				candidate = arr[index++];
				times = 1;
			}
			
			if(arr[index++]==candidate) {
				times++;
			}else {
				times--;
			}
		}
		return candidate;
	}
	
	public static int partition(int[] arr,int begin,int end) {
		int l=begin+1,r=end,p=begin;
		while(l<=r) {
			while(l<=r&&arr[p]>=arr[l])
				l++;
			while(l<=r&&arr[p]<arr[r])
				r--;
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

}
