package com.fjx;

import java.util.Arrays;

public class AllSort {
	
	static int[] a = {1,2,3,4,5};
	static int[] a1 = {1,1,1,0,0};
	static boolean[] visit = new boolean[5];
	static int[] b = new int[5];
	public static void main(String[] args) {
		allSort2(0);
	}
	
	static void allSort(int k){
		if(k==5) {
			System.out.println(Arrays.toString(a));
			return;
		}
		
		for(int i=k;i<5;i++) {
			int t = a[k];
			a[k] = a[i];
			a[i] = t;
			allSort(k+1);
			t = a[k];
			a[k] = a[i];
			a[i] = t;
		}
	}
	
	static void allSort2(int k) {
		if(k==5) {
			System.out.println(Arrays.toString(b));
			return;
		}
		
		for(int i=0;i<5;i++) {
			if(i>0&&a1[i]==a1[i-1]&&!visit[i-1]) {
				continue;
			}
			if(!visit[i]) {
				visit[i] = true;
				b[k] = a1[i];
				allSort2(k+1);
				visit[i] = false;
			}
		}
	}
	

}
