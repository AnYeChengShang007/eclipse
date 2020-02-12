package com.fjx.algorithm.查找与排序_上;

/*
 * 有个排序后的字符串数组，其中散步者一些空字符串
 * 编写一个方法，找出给定字符串（坑定不是空字符串）
 * 的索引
 */
public class 在有空字符串的有序字符串数组中查找 {
	public static void main(String[] args) {
		String[] arr = {"a","","ac","","ad","b","","ba"};
		System.out.println(indexOf(arr, "adcs"));
		
	}
	public static int indexOf(String[] arr,String key) {
		int begin = 0,end = arr.length-1;
		while(begin<=end) {
			int mid = begin+((end-begin)>>2);
			int mid2 = mid;
			while(arr[mid].equals("")) {
				mid++;
			}
			if(arr[mid].compareTo(key)>0) {
				end = mid2-1;
			}else if(arr[mid].compareTo(key)<0) {
				begin = mid+1;
			}else {
				return mid;
			}
			
		}
		
		return -1;
	}
}
