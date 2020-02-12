package com.fjx.algorithm.查找和排序_下;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 输入一个正整数，爸数组里所有整数拼接起来排成一个数，
 * 打印出能拼接出的所有数字中最小的一个。
 * 例如输入数组｛3，32，321｝,则打印出者3哥数字能排成的最小
 * 数组为：321213
 */
public class 数组能排成的最小数 {
	
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
