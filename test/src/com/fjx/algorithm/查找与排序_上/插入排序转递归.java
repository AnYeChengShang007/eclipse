package com.fjx.algorithm.²éÕÒÓëÅÅÐò_ÉÏ;

import java.util.Arrays;
import java.util.Random;

public class ²åÈëÅÅÐò×ªµÝ¹é {
	
	public static void insertSort(int arr[],int k) {
		
		if(k==0)
			return;
		
		insertSort(arr,k-1);
		
		int x = arr[k-1];
		int index = k-2;
		while(index>=0 && x<arr[index]) {
			arr[index+1] = arr[index];
			index--;
		}
		arr[index+1] = x;
	}
	
	public static void main(String[] args) {
		int length = 30;
		int arr[] = new int[length];
		for(int i=0;i<length;i++) {
			arr[i] = new Random().nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		insertSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
