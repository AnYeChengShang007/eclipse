package com.fjx.algorithm.查找与排序_上;

public class 旋转数字出现的最小化数字 {
	
	/*
	 * 把一个子数组嘴开始的若干元素搬到数组的末尾，
	 * 我们称之为数组的旋转。输入一个递增排序的数
	 * 组的一个旋转，输出旋转数组的嘴小元素，例如数组
	 * {3,4,5,1,2,}为{1,2,3,4,5}的欧冠旋转，该数组的
	 * 最小值为1。
	 * 1,2,3,4,5,6,7
	 * 4,5,6,7,1,2,3
	 * 5,6,7,1,2,3,4
	 * 
	 */
	
	public static void main(String[] args) {
		int[] a = {4,5,6,7,1,2,3};
		System.out.println(fun(a,0,a.length-1));
	}
	
	public static int fun(int a[],int l,int r) {
		int mid = l+((r-l)>>1);
		if(r-l==1)
			return Math.min(a[l], a[r]);
		
		if(a[l]<a[mid])
			return fun(a,mid,r);
		else 
			return fun(a,l,mid);
	}
	
	
	
}
