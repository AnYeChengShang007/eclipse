package com.fjx.algorithm.���Һ�����_��;

import java.util.Arrays;
import java.util.Comparator;

/*
 * ����һ��������������������������ƴ�������ų�һ������
 * ��ӡ����ƴ�ӳ���������������С��һ����
 * �������������3��32��321��,���ӡ����3���������ųɵ���С
 * ����Ϊ��321213
 */
public class �������ųɵ���С�� {
	
	public static void main(String[] args) {
		Integer[] arr = {3,32,321};
		System.out.println(f(arr));
	}
	
	public static int f(Integer[] arr) {
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				String s1 = o1+""+o2;
				String s2 = o2+""+o1;
				return s1.compareTo(s2);
			}
		});
		StringBuilder sb = new StringBuilder();
		for(Integer num:arr) {
			sb.append(num);
		}
		return Integer.parseInt(sb.toString());
	}
}
