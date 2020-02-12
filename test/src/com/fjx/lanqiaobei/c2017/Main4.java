package com.fjx.lanqiaobei.c2017;

import java.util.Arrays;

public class Main4 {
	
	static int[] a = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
					  1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	static int[] b = new int[36];
	static boolean[] visit = new boolean[36];
	public static void main(String[] args) {
		allSort(0);
	}
	
	static void allSort(int k) {
		
		if(k==36) {
			System.out.println(Arrays.toString(b));
			return;
		}
		
		for(int i=0;i<36;i++) {
			
			if(i>0&&a[i]==a[i-1]&&!visit[i-1]) {
				continue;
			}
			if(!visit[i]) {
				visit[i] = true;
				b[k] = a[i];
				allSort(k+1);
				visit[i] = false;
			}
		}
		
		
	}
	

}
