package com.fjx.algorithm.����������_��;

public class ��ת���ֳ��ֵ���С������ {
	
	/*
	 * ��һ���������쿪ʼ������Ԫ�ذᵽ�����ĩβ��
	 * ���ǳ�֮Ϊ�������ת������һ�������������
	 * ���һ����ת�������ת�������СԪ�أ���������
	 * {3,4,5,1,2,}Ϊ{1,2,3,4,5}��ŷ����ת���������
	 * ��СֵΪ1��
	 * 1,2,3,4,5,6,7
	 * 4,5,6,7,1,2,3
	 * 5,6,7,1,2,3,4
	 * 
	 */
	
	public static void main(String[] args) {
		int[] a = {4,5,6,7,1,2,3};
		System.out.println(fun(a,0,a.length-1));
	}
	
	public static int fun(int a[],int l,int r) {
		int mid = l+((r-l)>>1);
		if(r-l==1)
			return Math.min(a[l], a[r]);
		
		if(a[l]<a[mid])
			return fun(a,mid,r);
		else 
			return fun(a,l,mid);
	}
	
	
	
}
