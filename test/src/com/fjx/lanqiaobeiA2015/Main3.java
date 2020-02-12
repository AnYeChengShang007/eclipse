package com.fjx.lanqiaobeiA2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
	
	static int[] a = {1,2,3,4,5,6,7,8,9};
	static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		f(0);
		Collections.sort(list);
		for(int num:list) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
	
	static void f(int k) {
		
		if(k==8) {
			check();
			return;
		}
		
		for(int i=k;i<9;i++) {
			int t = a[k];
			a[k] = a[i];
			a[i] = t;
			f(k+1);
			t = a[k];
			a[k] = a[i];
			a[i] = t;
		}
	}
	
	static void check() {
		
		int A = a[0]*100+a[1]*10+a[2];
		int B = a[3]*100+a[4]*10+a[5];
		int C = a[6]*100+a[7]*10+a[8];
		if(B%2==0 && C%3==0 && B/2==C/3 && B/2==A) {
			list.add(A);
		}
	}

}
