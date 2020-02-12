package com.fjx.algorithm.查找与排序_上;


/*
 * f(m,n) = f(n,m%n)
 */
public class 辗转相除法 {
	
	public static void main(String[] args) {
		System.out.println(f(6,3));
	}
	
	public static int f(int m,int n) {
		if(n==0)
			return m;
		return f(n,m%n);
	}

}
