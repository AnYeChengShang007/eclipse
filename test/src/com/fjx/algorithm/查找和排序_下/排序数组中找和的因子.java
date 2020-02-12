package com.fjx.algorithm.查找和排序_下;


/*
 * 给定已排序数组arr和k，不重复打印arr中所有相加和为
 * k的不降序二元组
 * 如输入arr={-8，-4，-3,0,2,4,5,8,9,10}，k=10
 * 输出（0，10）（2,8）
 */
public class 排序数组中找和的因子 {
	
	public static void main(String[] args) {
		int[] arr = {-8,-4,-3,0,2,4,5,8,9,10};
		fun1(arr,10);
	}
	
	//二分法
	public static void fun1(int[] arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			int key = sum - arr[i];
			int p=-1;
			if((p = findNum(arr, key, i+1, arr.length-1)) != -1) {
				System.out.println("("+arr[i]+" "+arr[p]+")");
			}
		}
	}
	
	//双指针法
	public static void fun2(int[] arr,int k) {
		int p1 = 0,p2 = arr.length-1;
		while(p1<p2) {
			if(arr[p1]+arr[p2]==k) {
				System.out.println("("+arr[p1]+" "+arr[p2]+")");
				p1++;
				p2--;
			}else if(arr[p1]+arr[p2]<k)
				p1++;
			else
				p2--;
		}
	}
	
	public static int findNum(int[] arr,int key,int start,int end) {
		while(start<=end) {
			int mid = start+((end-start)>>1);
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]<key) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
}
