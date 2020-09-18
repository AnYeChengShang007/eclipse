package com.fjx.algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class InsertSort {
	
	
	static int[] a = new int[10];
	static {
		for(int i=0;i<a.length-1;i++) {
			a[i] = (int) (Math.random()*50);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		insertSort(9);
		System.out.println(Arrays.toString(a));
	}
	
	/*static void insertSort(int k) {
		if(k==-1) {
			return;
		}
		
		insertSort(k-1);
		int index = k-1;
		int x = a[k];
		while(index>=0 && a[index]>x) {
			a[index+1] = a[index];
			index--;
		}
		a[index+1] = x;
	}*/
	static void insertSort(int k) {
		
		if(k==-1) {
			return;
		}
		
		insertSort(k-1);
		int index = k-1;
		int x = a[k];
		while(index>=0 && a[index]>x) {
			a[index+1] = a[index];
			index--;
		}
		a[index+1] = x;
	}

}
