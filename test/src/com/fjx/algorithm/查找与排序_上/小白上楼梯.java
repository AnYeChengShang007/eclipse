package com.fjx.algorithm.����������_��;

/*
 * С��������¥�ݣ�¥����n��̨�ף�С��һ�ο���
 * ��1,2,3�ڣ�ʵ��һ������������С���ж���
 * ������¥�ݵķ�ʽ
 */
public class С����¥�� {
	
	public static void main(String[] args) {
		System.out.println(f(3  ));
	}
	
	public static int f(int n) {
		if(n==1)
			return 1;
		if(n==0)
			return 1;
		if(n>=3)
			return (f(n-1)+f(n-2)+f(n-3));
		else if(n>=2)
			return (f(n-1)+f(n-2));
		else
			return f(n-1);
	}
}
