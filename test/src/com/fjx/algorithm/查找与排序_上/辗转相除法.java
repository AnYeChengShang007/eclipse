package com.fjx.algorithm.����������_��;


/*
 * f(m,n) = f(n,m%n)
 */
public class շת����� {
	
	public static void main(String[] args) {
		System.out.println(f(6,3));
	}
	
	public static int f(int m,int n) {
		if(n==0)
			return m;
		return f(n,m%n);
	}

}
