package com.fjx.algorithm.���Һ�����_��;


/*
 * ��������������arr��k�����ظ���ӡarr��������Ӻ�Ϊ
 * k�Ĳ������Ԫ��
 * ������arr={-8��-4��-3,0,2,4,5,8,9,10}��k=10
 * �����0��10����2,8��
 */
public class �����������Һ͵����� {
	
	public static void main(String[] args) {
		int[] arr = {-8,-4,-3,0,2,4,5,8,9,10};
		fun1(arr,10);
	}
	
	//���ַ�
	public static void fun1(int[] arr,int sum) {
		for(int i=0;i<arr.length;i++) {
			int key = sum - arr[i];
			int p=-1;
			if((p = findNum(arr, key, i+1, arr.length-1)) != -1) {
				System.out.println("("+arr[i]+" "+arr[p]+")");
			}
		}
	}
	
	//˫ָ�뷨
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
