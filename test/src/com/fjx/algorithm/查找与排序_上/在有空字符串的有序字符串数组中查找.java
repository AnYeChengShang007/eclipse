package com.fjx.algorithm.����������_��;

/*
 * �и��������ַ������飬����ɢ����һЩ���ַ���
 * ��дһ���������ҳ������ַ������Ӷ����ǿ��ַ�����
 * ������
 */
public class ���п��ַ����������ַ��������в��� {
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
