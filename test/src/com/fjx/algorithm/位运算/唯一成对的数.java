package com.fjx.algorithm.λ����;

import java.util.Arrays;
import java.util.Random;

public class Ψһ�ɶԵ��� {
	/*
	 * �ڴ�1~1001��������1~1000����������ֻ��һ�������ظ��ģ���������
	 * 
	 * ���� a^a=0,b^0=b  ==>   a^a^b^c^c = b
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
