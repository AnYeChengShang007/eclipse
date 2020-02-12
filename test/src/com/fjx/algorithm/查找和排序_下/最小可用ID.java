package com.fjx.algorithm.���Һ�����_��;

import java.util.Arrays;

/*
 * �ڷǸ��������ҵ���С�Ŀɷ����ID��
 * ��1��ʼ��ţ�������1000000
 */
public class ��С����ID {
	
	public static void main(String[] args) {
		int[] arr = {6,1,3,5,4,7};
		System.out.println(findId(arr,0,arr.length-1));
	}
	/*
	 * 1,3,4,5,6
	 * 0,1,2,3,4
	 * 1,3
	 */
	public static int findId(int[] arr,int l,int r) {
		int p = partition(arr, l, r);
		if(p+1<=arr[p]) {
			return findId(arr,p+1,r);
		}else {
			return findId(arr,l,p-1);
		}
	}
	
	public static int partition(int[] arr,int start,int end) {
		 int l = start+1,r = end,p = start;
		 while(l<=r) {
			 while(l<=r&&arr[l]<=arr[p])
				 l++;
			 while(l<=r&&arr[r]>=arr[p])
				 r--;
			 if(l<r) {
				 int t = arr[l];
				 arr[l] = arr[r];
				 arr[r] = t;
			 }
		 }
		 int t = arr[p];
		 arr[p] = arr[r];
		 arr[r] = t;
		 return r;
	}

}
