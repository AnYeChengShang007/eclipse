package com.fjx.algorithm.查找与排序_上;

import java.util.Arrays;
import java.util.Random;

/*
 * 一次一个增量，用增量来分组，组内进行插入排序
 */
public class 希尔排序 {
	
	public static void main(String[] args) {
		int length = 30;
		int arr[] = new int[length];
		for(int i=0;i<length;i++) {
			arr[i] = new Random().nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shellSort(int arr[]) {
		for(int interval = arr.length/2;interval>0;interval/=2) {
			for(int i=interval;i<arr.length;i+=interval) {
				int x = arr[i];
				int j = i-interval;
				while(j>=0&&x<arr[j]) {
					arr[j+interval] = arr[j];
					j-=interval;
				}
				arr[j+interval] = x;
			}
		}
	}

}
