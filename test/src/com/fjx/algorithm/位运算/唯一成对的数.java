package com.fjx.algorithm.位运算;

import java.util.Arrays;
import java.util.Random;

public class 唯一成对的数 {
	/*
	 * 在从1~1001个数中有1~1000的数，其中只有一个数是重复的，求出这个数
	 * 
	 * 规律 a^a=0,b^0=b  ==>   a^a^b^c^c = b
	 */
	public static void main(String[] args) {
		int N = 1001;
		int a[] = new int[N];
		for(int i=0;i<N-1;i++) {
			a[i] = i+1;
		}
//		System.out.println(Arrays.toString(a));
		a[N-1] = new Random().nextInt(N-1)+1;
		int index = new Random().nextInt(N-1)+1;
		a[index]^=a[N-1];
		a[N-1]^=a[index];
		a[index]^=a[N-1];
		int x=0;
		for(int i=1;i<=N-1;i++) {
			x^=i;
		}
		for(int i=0;i<N;i++) {
			x^=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(x);
	}
}
