package com.fjx.algorithm.���Һ�����_��;

import java.util.Arrays;

/*
 * Ҫ��ʱ�临�Ӷ�ΪO��n��
 */
public class ������ż��ǰ�� {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		fun(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void fun(int[] arr) {
		int[] arr1 = new int[arr.length];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		int begin = 0,end = arr.length-1,scan=0;
		while(scan<arr.length) {
			if((arr1[scan]&1)==0) {
				arr[end--] = arr1[scan++];
			}else {
				arr[begin++] = arr1[scan++];
			}
		}
		
	}

}
