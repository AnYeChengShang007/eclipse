package com.fjx.algorithm.����������_��;

import java.util.Arrays;
import java.util.Random;

/*
 * һ��һ�������������������飬���ڽ��в�������
 */
public class ϣ������ {
	
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
